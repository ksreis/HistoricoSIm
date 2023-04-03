package view;

import java.util.Scanner;
import Kreis.PilhaString.StringsPilha;
import Controller.HistoricoController;

public class Principal {

    public static void main(String[] args) {

        StringsPilha historico = new StringsPilha();

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Inserir endereço");
            System.out.println("2 - Remover último endereço");
            System.out.println("3 - Consultar último endereço");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o endereço:");
                    String endereco = scanner.nextLine();
                    try {
                        HistoricoController.inserirEndereco(endereco, historico);
                        System.out.println("Endereço inserido com sucesso!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String ultimoEnderecoRemovido = HistoricoController.removerUltimoEndereco(historico);
                        System.out.println("Endereço removido: " + ultimoEnderecoRemovido);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        String ultimoEndereco = HistoricoController.consultarUltimoEndereco(historico);
                        System.out.println("Último endereço visitado: " + ultimoEndereco);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();

    }

}
