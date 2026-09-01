/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
package exBanco;

import java.util.Scanner;

// Classe responsável pelo menu e pela entrada de dados.
public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        // Conta criada com saldo inicial igual a zero.
        Banco c1 = new Banco(1, 100, "Sede", 1);

        try {
            while (op != 4 && op != 5) {
                exibirMenu();

                try {
                    op = Integer.parseInt(sc.nextLine());

                    if (op < 1 || op > 5) {
                        System.out.println("Opcao invalida. Escolha de 1 a 5.");
                        continue;
                    }

                    switch (op) {
                        //Solicita um valor ao usuário, credita na conta
                        case 1:
                            if (c1.getTipo() != 4) {
                                double valorCredito = lerValor(
                                        sc,
                                        "Digite o valor para creditar: R$ "
                                );

                                c1.creditar(valorCredito);
                                System.out.printf(
                                        "Credito realizado. Novo saldo: R$ %.2f%n",
                                        c1.getSaldo()
                                );
                            } else {
                                System.out.println("A conta esta encerrada.");
                            }
                            break;
                        //Solicita um valor ao usuário, debita da conta
                        case 2:
                            if (c1.getTipo() != 4) {
                                double valorDebito = lerValor(
                                        sc,
                                        "Digite o valor para debitar: R$ "
                                );

                                c1.debitar(valorDebito);
                                System.out.printf(
                                        "Debito realizado. Novo saldo: R$ %.2f%n",
                                        c1.getSaldo()
                                );
                            } else {
                                System.out.println("A conta esta encerrada.");
                            }
                            break;
                        //Consulta e exibe o saldo atual da conta.
                        case 3:
                            System.out.println(c1.consultarSaldo());
                            break;
                        /*Verifica se o saldo está negativo. Se estiver negativo, 
                        não permite encerrar a conta. Caso contrário, encerra a conta, 
                        altera o tipo para 4, devolve o saldo disponível e zera o saldo.*/
                        case 4:
                            if (c1.getSaldo() < 0) {
                                System.out.println(
                                        "Nao e possivel encerrar uma conta com saldo negativo."
                                );

                                // Permite que o menu continue sendo exibido.
                                op = 0;
                            } else {
                                double saldoEncerrado = c1.encerrarConta();
                                c1.textoEncerrar(saldoEncerrado);
                            }
                            break;
                        //Encerra a execução do programa.
                        case 5:
                            System.out.println("Programa encerrado.");
                            break;

                        default:
                            System.out.println("Opcao invalida.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Erro: digite somente valores numericos.");
                } catch (IllegalArgumentException | IllegalStateException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Exibe as opções disponiveis para o usuario.
    private static void exibirMenu() {
        System.out.println("===== SISTEMA BANCARIO =====");
        System.out.println("1 - Creditar");
        System.out.println("2 - Debitar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar conta");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    // Lê valores monetários e aceita ponto ou vírgula como separador decimal.
    private static double lerValor(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        String entrada = sc.nextLine().replace(',', '.');
        return Double.parseDouble(entrada);
    }
}
