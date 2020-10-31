package UNASP.OrientacaoAObjetos.ContaBancaria;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double v) {
        this.saldo += v;
    }

    public void debitar(double v) {
        saldo -= saldo < v ? v + 10.0 : v;
    }
}