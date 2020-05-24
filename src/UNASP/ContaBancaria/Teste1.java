package UNASP.ContaBancaria;

public class Teste1 {


    public static void executa() {

        Cliente oto = new Cliente();
        oto.nome = "Oto Silva";

        Cliente ana = new Cliente();
        ana.nome = "Ana Bitar";

        Cliente cid = new Cliente();
        cid.nome = "Cid Lindo";

        //Apresentacao - Mostrando clientes cadastrados
        System.out.println("\n1) Clientes *****");
        System.out.println(oto.nome);
        System.out.println(ana.nome);
        System.out.println(cid.nome);

    }
}
