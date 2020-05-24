package UNASP.ContaBancaria;

public class Operacao {

    public static void transferir(double value, Conta contaOrigem, Conta contaDestino) {
        contaOrigem.debitar(value);
        contaDestino.creditar(value);
    }
}