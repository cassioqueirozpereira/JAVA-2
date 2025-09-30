package com.escola;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        SistemaEscola sistema = new SistemaEscola();
        int opcao = -1;

        while (true) {
            System.out.println("\n------------------------------------------------------------");
            // Menu ajustado para a nova nomenclatura (1-ReadAll, 2-Create, 3-Delete)
            System.out.println(" 1-Listar | 2-Listar Todos | 3-Inserir | 4-Excluir | 0-Sair");
            System.out.println("------------------------------------------------------------");
            System.out.print("Escolha uma opção: ");

            try {
                String linha = SistemaEscola.entrada.readLine(); 
                if (linha == null || linha.trim().isEmpty()) continue;
                
                opcao = Integer.parseInt(linha);

                if (opcao == 0) {
                    System.out.println("Sistema encerrado.");
                    // NOVO: Chamada para desligar o banco de dados Derby
                    sistema.shutdownDerby();
                    break;
                }

                switch (opcao) {
                    case 1:
                        sistema.read(); // Chama read
                        break;
                    case 2:
                        sistema.readAll(); // Chama readAll
                        break;
                    case 3:
                        sistema.createAluno(); // Chama createAluno
                        break;
                    case 4:
                        sistema.deleteAluno(); // Chama deleteAluno
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: Digite um número para a opção.");
            } catch (Exception e) {
                // Captura exceções JPA/BD e exibe
                System.err.println("\nERRO DO SISTEMA: " + e.getMessage());
            }
        }
    }
}