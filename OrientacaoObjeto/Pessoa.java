/*
    Construtor: Sempre tem o mesmo nome da classe
        Por padrão a JVM cria em tempo de execução um construtor padrão e vazio
        Podemos ter mais de um construtor na classe
        this -> significa este objeto
 */

public class Pessoa {
    String nome, email;
    int ano_nascimento;

    //Construtor vazio
    public Pessoa(){}

    // Construtor com parâmetros
    public Pessoa(String nome, String email, int ano_nascimento){
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_info(){
        System.out.println("Nome " + this.nome);
        System.out.println("Email " + this.email);
        System.out.println("Ano nascimento " + this.ano_nascimento);
    }
}
