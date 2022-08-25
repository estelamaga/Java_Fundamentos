/*
    Atributos estáticos: são atributos, onde os valores são compartilhados
    entre as instâncias das classes.
    Para utilizar um atributo estático colocamos o nome da classe junto ao atributo
    EX: NomeDaClasse.atributo
 */

public class AtributosEstatico {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("Estela");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        ContaBancaria c2 = new ContaBancaria("Livia");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        ContaBancaria c3 = new ContaBancaria("Anthony");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());

        System.out.println(ContaBancaria.contador);

        ContaBancaria.contador = 42;
        System.out.println(ContaBancaria.contador);

    }
}
