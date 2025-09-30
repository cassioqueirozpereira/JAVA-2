package com.escola;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

public class SistemaEscola {

    private final AlunoDAO dao = new AlunoDAO();
    public static final BufferedReader entrada = new BufferedReader(
        new InputStreamReader(System.in)
    );

    // Método de Exibição
    private void display(Aluno aluno) {
        System.out.println(
            "Aluno: " + aluno.getName() + 
            "\nMatrícula: " + aluno.getRegistration() +
            "\nSetor: " + aluno.getSetor() +
            "\nEntrada: " + aluno.getYear() + 
            "\n================================="
        );
    }

    public void read() {
        System.out.print("Matrícula do Aluno a ser exibido: ");
        try {
            String registration = entrada.readLine();
            Aluno aluno = dao.read(registration); // Chama read
            
            if (aluno != null) {
                System.out.println("\n=================================");
                display(aluno);
            } else {
                System.out.println("Aluno não encontrado.");
            }
        } catch (IOException e) {
            System.err.println("ERRO: Falha ao ler a entrada do usuário.");
        }
    }

    // Método para ler e exibir todos os alunos (chama dao.readAll)
    public void readAll() {
        System.out.println("\n--- Lista de Todos os Alunos ---");
        System.out.println("\n=================================");
        
        List<Aluno> lista = dao.readAll(); 
        
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            lista.forEach(this::display);
        }
    }
    
    // Método para receber dados e chamar o create (chama dao.create)
    public void createAluno() throws IOException {
        Aluno aluno = new Aluno();
        System.out.println("\n--- Inserir Novo Aluno ---");
        
        try {
            System.out.print("Nome: ");
            aluno.setName(entrada.readLine());
            
            System.out.print("Matrícula: ");
            aluno.setRegistration(entrada.readLine());

            System.out.print("Setor: ");
            aluno.setSetor(entrada.readLine());
            
            System.out.print("Entrada (Ano): ");
            aluno.setYear(Integer.parseInt(entrada.readLine()));
            
        } catch (NumberFormatException e) {
            System.err.println("ERRO: O ano de entrada deve ser um número inteiro. Inserção cancelada.");
            return; 
        }

        dao.create(aluno); // Chama create
        System.out.println("Aluno " + aluno.getName() + " inserido com sucesso!");
    }

    // Método para excluir um aluno (chama dao.delete)
    public void deleteAluno() throws IOException {
        System.out.println("\n--- Excluir Aluno ---");
        System.out.print("Matrícula do Aluno a ser excluído: ");
        
        String registration = entrada.readLine();
        dao.delete(registration); // Chama delete
        System.out.println("Comando de exclusão executado para a matrícula: " + registration + ".");
    }

    // Método para desligar o banco de dados Embedded
    public void shutdownDerby() {
        try {
            // A URL de desligamento.
            java.sql.DriverManager.getConnection("jdbc:derby:ESCOLA;shutdown=true");
        } catch (java.sql.SQLException se) {
            // Códigos de erro que indicam DESLIGAMENTO BEM-SUCEDIDO no Derby:
            // XJ015 (comum) e 08006 (comum em algumas plataformas/versões)
            if (se.getSQLState().equals("XJ015") || se.getSQLState().equals("08006")) {
                System.out.println("\n[INFO] Banco de dados Derby 'ESCOLA' desligado com sucesso.");
            } else {
                // Se for qualquer outro erro, deve ser reportado
                System.err.println("\n[ERRO REAL] Falha ao desligar o Derby. Código: " + se.getSQLState());
                se.printStackTrace();
            }
        }
    }
}