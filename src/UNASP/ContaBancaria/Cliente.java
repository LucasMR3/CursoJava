package UNASP.ContaBancaria;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Conta> contas = new ArrayList<>();

//    private Set<Conta> contas = new HashSet<>();

    public void adicionaConta(Conta contaAdded) {
        contas.add(contaAdded);
    }

    public ArrayList<Conta> getCarteira(){
        return contas;
    }

}
