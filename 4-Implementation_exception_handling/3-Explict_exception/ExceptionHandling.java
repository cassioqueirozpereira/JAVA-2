public class ExceptionHandling {
    public static int getElemento(int i, int [] vetor) {
        try {
            if (i < 0 || i > 3)
                throw new IllegalAccessException();
        } catch (Exception e) {
            System.out.println("Erro: índice fora dos limites do vetor.");
        }
        return vetor[i];
    }

    public static void main(String[] args) {
        int [] vetor = {1, 2, 3, 4};
        int x = getElemento(5, vetor);
        System.out.println("O elemento na quinta posição do vetor é: " + x);
    }
}

// PROGRAMA MAIS COMPLETO.

// RESOLVENDO O ERRO INESPERADO PARA QUE NÃO INFORME UMA MENSAGEM DO SISTEMA.

// public class ExceptionHandling {
//     // O método agora declara que PODE lançar uma exceção.
//     // Usamos ArrayIndexOutOfBoundsException que é mais apropriada para o contexto.
//     public static int getElemento(int i, int [] vetor) {
//         if (i < 0 || i >= vetor.length)
//             // Lançamento EXPLÍCITO da exceção com uma mensagem clara.
//             throw new ArrayIndexOutOfBoundsException("Índice " + i + " está fora dos limites para o vetor de tamanho " + vetor.length);
        
//         return vetor[i];
//     }

//     public static void main(String[] args) {
//         int [] vetor = {1, 2, 3, 4};
        
//         // O chamador agora é responsável por tratar o possível erro.
//         try {
//             int x = getElemento(5, vetor);
//             System.out.println("O elemento na quinta posição do vetor é: " + x);
//         } catch (Exception e) {
//             System.out.println("Ocorreu um erro ao tentar acessar o vetor: " + e.getMessage());
//         }
//     }
// }