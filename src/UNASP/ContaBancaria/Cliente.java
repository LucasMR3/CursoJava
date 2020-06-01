package UNASP.ContaBancaria;

import java.util.ArrayList;

public class Cliente {

    String nome;
    private  ArrayList<Conta> carteira = new ArrayList<>();
//    private Set<Conta> contas = new HashSet<>();

    public void adicionaConta(Conta contaAdded) {
        carteira.add(contaAdded);
    }

    public ArrayList<Conta> getCarteira(){
        return carteira;
    }
}
