package UNASP.OrientacaoAObjetos.ParImpar;

import UNASP.OrientacaoAObjetos.ParImpar.ParImpar;

import java.util.Scanner;

//ESTA CLASSE NÃO PODE SER ALTERADA
class ParImparProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParImpar tool = new ParImpar();
        int number;
        number = sc.nextInt();

        if (tool.isImpar(number) == true){
            System.out.println("IMPAR");
        } else
            System.out.println("PAR");
    }
}