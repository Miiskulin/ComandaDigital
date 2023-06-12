// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import models.Comanda;
import models.Garcom;
import models.ItemProduto;
import models.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer opcao = 1;
        Integer opcaoMenu2 = 2;

        while (opcao != 2) {
            System.out.println("BEM VINDO AO SISTEMA X:");

            System.out.println("MENU:");
            System.out.println("1 - INICIAR COMANDA:");
            System.out.println("2 - SAIR:");
            opcao = sc.nextInt();

            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o codigo do Garçom:");
                    Integer idGarcom = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome do Garçom:");
                    String nomeGarcom = sc.nextLine();

                    System.out.println("Digite o número da Comanda:");
                    Integer numeroComanda = sc.nextInt();
                    sc.nextLine();

                    Garcom garcom = new Garcom(idGarcom, nomeGarcom);
                    Comanda comanda = new Comanda(numeroComanda);

                    garcom.NovaComanda(comanda);

                    while (opcaoMenu2 != 5) {
                        System.out.println("1 - ADICIONAR PRODUTO:");
                        System.out.println("2 - REMOVER PRODUTO:");
                        System.out.println("3 - VISUALIZAR COMANDA:");
                        System.out.println("4 - FINALIZAR COMANDA:");
                        System.out.println("5 - VOLTAR: ");
                        opcaoMenu2 = sc.nextInt();

                        sc.nextLine();
                        switch (opcaoMenu2) {
                            case 1:
                                System.out.print("Codigo: ");
                                Integer pCodigo = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Nome: ");
                                String pName = sc.nextLine();
                                System.out.print("Valor: R$");
                                float pValor = sc.nextFloat();
                                sc.nextLine();
                                System.out.print("Descrição: ");
                                String pDescricao = sc.nextLine();
                                System.out.print("Tipo: ");
                                String pTipo = sc.nextLine();
                                System.out.print("Quantidade: ");
                                Integer quantidade = sc.nextInt();
                                sc.nextLine();

                                ItemProduto itemProduto = new ItemProduto(pCodigo, pName, pValor, pDescricao);
                                Produto produto = new Produto(quantidade, pTipo, itemProduto);

                                comanda.AdicionarItem(produto);

                                System.out.println("Produto adicionado com sucesso!\n");
                                break;
                            case 2:
                                System.out.print("Digite o codigo do produto que quer remover: ");
                                Integer codigoRemover = sc.nextInt();
                                sc.nextLine();

                                Produto prodRemove = comanda.getProduto(codigoRemover);
                                comanda.RemoverItem(prodRemove);
                                System.out.println("Produto removido com sucesso!\n");
                                comanda.CalcularValorTotal();
                                break;
                            case 3:
                                comanda.CalcularValorTotal();
                                System.out.println(comanda.VisualizarComanda());
                                break;
                            case 4:
                                System.out.println("A taxa de serviço de 10% foi aplicada!, o valor total é: ");
                                garcom.AplicarTaxaServico(numeroComanda);
                                System.out.println(comanda.FinalizarComanda());
                                opcaoMenu2 = 5;
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        }
                    }
                default:
                    break;
            }
        }
    }
}