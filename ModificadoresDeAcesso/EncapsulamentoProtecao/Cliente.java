package EncapsulamentoProtecao;

public class Cliente {
    private  String nome;
    private  String endereco;

    //Criando construtor
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String nome() {
        return nome;
    }

    public String endereco() {
        return endereco;
    }
}
