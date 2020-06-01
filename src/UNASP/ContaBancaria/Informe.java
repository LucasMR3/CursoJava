package UNASP.ContaBancaria;

import java.util.ArrayList;

public class Informe {

    public String categoria(Cliente c) {
        String category = (montante(c) > 100000.0 ) ? "INVESTIDOR" : (montante(c) < 0.0 ) ? "DEVEDOR":
                "PADRAO";
        return category;
    }

    public double montante(Cliente c) {
        double amount = 0.0;
        for (Conta conta : c.getCarteira()) {
            amount += conta.getSaldo();
        }

//        ArrayList<Conta> conta = c.getCarteira();
//        for (int i = 0; c.getCarteira().size() > i; i++){
//            amount += conta.get(i).getSaldo();
//        }

        return amount;
    }
}
