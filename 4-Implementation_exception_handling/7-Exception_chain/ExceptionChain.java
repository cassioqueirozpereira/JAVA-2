import java.io.IOException;

class ExceptionChain {
    public static void main(String[] args) {
        try {
            abrirArquivo();
        } catch (ExceptionFileOpen e) {
            System.out.println("Um erro ocorreu na tentativa de abrir o arquivo: " + e.getMessage());
            System.out.println("Causa raiz: " + e.getCause().getMessage());
        }
    }

    public static void abrirArquivo() throws ExceptionFileOpen {
        try {
            // Simulando uma exceção ao abrir o arquivo
            throw new IOException("Incapaz de abrir o arquivo");
        } catch (IOException e) {
            // Envolvendo a exceção capturada em uma exceção personalizada
            throw new ExceptionFileOpen("Erro ao abrir o arquivo", e);
        }
    }
}