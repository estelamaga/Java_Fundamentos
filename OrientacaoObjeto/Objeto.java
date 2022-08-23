/*
    Objetos: são produtos / instâncias da classe
 */

public class Objeto {
    public static void main(String[] args) {

        // Declarar um objeto
        Produto p1;
        p1 = new Produto();
        p1.nome = "Caneta";
        p1.preco = 1.2f;
        p1.desconto = 1;

        System.out.println("-------------Produtos-------------");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "%");

        // Declaração e Instânciação/inicialização do objeto
        // meuProduto -> chamado de instância ou objeto
        Produto meuProduto = new Produto();
        meuProduto.preco = 2.40f;
        meuProduto.nome = "Notebook";
        meuProduto.desconto = 0.30f;

        System.out.println(meuProduto.nome);
        System.out.println("R$ " + meuProduto.preco);
        System.out.println(meuProduto.desconto + "%");
    }
}
