package EncapsulamentoProtecao;

public class Modificadores {
    public static void main(String[] args) {
        // Instanciar
        Cliente estela = new Cliente("Estela","Rua: Imprensa, 366");
        Cliente livia = new Cliente("Lívia","Rua: Imprensa, 366");
        Conta bra_estela = new Conta(2345,500f,1000f,estela);
        Conta bra_livia = new Conta(2345,400000f,600000f,livia);

//        System.out.println("Saldo Livia " + bra_livia.getSaldo());
//        System.out.println("Saldo Estela " + bra_estela.getSaldo());

        bra_estela.sacar(100f);
        System.out.println("Saldo depois do saque " + bra_estela.getSaldo());
//        System.out.println("Consultar limite " + bra_estela.getLimite());
    }
}
