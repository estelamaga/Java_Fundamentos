/*
    Aluno é uma Pessoa

    Quando uma classe HERDA de outra classe ganha:
    TODOS OS ATRIBUTOS E MÉTODOS DA CLASSE HERDADA.
*/

public class Aluno extends Pessoa {
    private String ra;

    // Criando construtor
    public  Aluno(String nome, int ano_nascimento, String ra, String email){
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
