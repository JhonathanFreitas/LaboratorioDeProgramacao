/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhona
 */
package exBanco;

// Classe responsável por armazenar os dados e realizar as operações da conta.
public class Banco {
    private int numero;
    private int agNumero;
    private String agNome;
    private int tipo;
    private double saldo;

    // Construtor padrão.
    public Banco() {
        saldo = 0;
    }

    // Construtor com saldo inicial igual a zero.
    public Banco(int numero, int agNumero, String agNome, int tipo) {
        this.numero = numero;
        this.agNumero = agNumero;
        this.agNome = agNome;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgNumero() {
        return agNumero;
    }

    public String getAgNome() {
        return agNome;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    // Adiciona um valor ao saldo da conta.
    public void creditar(double valor) {
        verificarContaAtiva();
        verificarValor(valor);
        saldo += valor;
    }

    // Retira um valor do saldo. A conta pode ficar com saldo negativo.
    public void debitar(double valor) {
        verificarContaAtiva();
        verificarValor(valor);
        saldo -= valor;
    }

    // Retorna uma mensagem com o número da conta e o saldo atual.
    public String consultarSaldo() {
        return String.format(
                "Conta %d - Saldo atual: R$ %.2f",
                numero,
                saldo
        );
    }

    // Encerra a conta, devolve o saldo disponível e zera o saldo.
    public double encerrarConta() {
        verificarContaAtiva();

        if (saldo < 0) {
            throw new IllegalStateException(
                    "A conta nao pode ser encerrada com saldo negativo."
            );
        }

        double saldoEncerrado = saldo;
        tipo = 4;
        saldo = 0;

        return saldoEncerrado;
    }

    // Exibe os dados da conta encerrada e o valor devolvido ao cliente.
    public void textoEncerrar(double saldoEncerrado) {
        System.out.println("Conta encerrada com sucesso!");
        System.out.println("Numero da conta: " + numero);
        System.out.println("Tipo da conta: " + tipo);
        System.out.printf("Saldo devolvido: R$ %.2f%n", saldoEncerrado);
    }

    // Impede operações em uma conta encerrada.
    private void verificarContaAtiva() {
        if (tipo == 4) {
            throw new IllegalStateException("A conta ja esta encerrada.");
        }
    }

    // Impede valores iguais a zero, negativos ou inválidos.
    private void verificarValor(double valor) {
        if (valor <= 0 || Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new IllegalArgumentException(
                    "O valor deve ser maior que zero."
            );
        }
    }
}
