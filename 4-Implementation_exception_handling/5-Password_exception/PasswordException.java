import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Set;

class PasswordException {
    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        String senhaCriada = "";
        String usuario = "";
        
        // --- Laço para validar o nome de usuário ---
        while (true) {
            usuario = JOptionPane.showInputDialog("Digite seu nome de usuário: ");
            
            // Verifica se a entrada é null (cancelamento) ou vazia.
            if (usuario == null || usuario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O nome de usuário não pode ser vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else
                break;
        }
        
        // --- Laço para criar e validar a senha ---
        while (true) {
            String senhaDigitada = JOptionPane.showInputDialog("Crie sua senha: ");
            
            try {
                validarSenha(senhaDigitada);
                senhaCriada = senhaDigitada;
                JOptionPane.showMessageDialog(null, "Senha criada com sucesso!", "Validação de Senha", JOptionPane.INFORMATION_MESSAGE);
                break;
            } catch (InvalidPasswordException e) {
                JOptionPane.showMessageDialog(null, "Senha inválida! \n\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // --- Laço para verificar o login ---
        while (true) {
            String senhaVerificacao = JOptionPane.showInputDialog("Digite sua senha para acessar: ");
            
            if (senhaVerificacao == null) {
                // Se o usuário cancelar aqui, exibe uma mensagem e pede a senha novamente.
                JOptionPane.showMessageDialog(null, "Senha de acesso não digitada. Por favor, tente novamente.", "Acesso", JOptionPane.ERROR_MESSAGE);
            } else if (senhaVerificacao.equals(senhaCriada)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido!", "Acesso", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "PARABÉNS " + usuario.toUpperCase() + "!\n\nNão foi fácil né!\nMas valeu a pena!\n\nAté a próxima!", "Bem-vindo", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta. Acesso negado.", "Acesso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void validarSenha(String senha) throws InvalidPasswordException {
        if (senha == null) {
            throw new InvalidPasswordException("A senha não pode ser nula.");
        }
        if (senha.length() < 8) {
            throw new InvalidPasswordException("A senha deve ter no mínimo 8 caracteres.");
        }
        if (!senha.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("A senha deve conter pelo menos uma letra maiúscula.");
        }
        if (!senha.matches(".*\\d.*")) {
            throw new InvalidPasswordException("A senha deve conter pelo menos um número.");
        }
        // A barra invertida `\` é movida para o início do conjunto para evitar a necessidade de escapá-la.
        if (!senha.matches(".*[!@#$%^&*()\\-_+=\\[\\]|\\\\:;\"'<>,.?/].*")) {
            throw new InvalidPasswordException("A senha deve conter pelo menos um caractere especial.");
        }
        if (senha.contains(" ")) {
            throw new InvalidPasswordException("A senha não deve conter espaços em branco.");
        }
        if (senha.equals(senha.toLowerCase()) || senha.equals(senha.toUpperCase())) {
            throw new InvalidPasswordException("A senha deve conter letras maiúsculas e minúsculas.");
        }

        Set<Character> caracteresVistos = new HashSet<>();
        for (char c : senha.toCharArray()) {
            if (!caracteresVistos.add(c)) {
                throw new InvalidPasswordException("A senha não pode conter caracteres repetidos.");
            }
        }
    }
}