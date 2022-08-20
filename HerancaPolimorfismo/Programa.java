public class Programa {
    public static void main(String[] args) {

        Pessoa novaPessoa = new Pessoa("Estela",1988,"estela.maga@hotmail.com");
        System.out.println(novaPessoa.getNome());
        System.out.println(novaPessoa.getAno_nascimento());
        System.out.println(novaPessoa.getEmail());

        Professor p1 = new Professor("Livia",1988,"abc123", "livia.motta@hotmail.com");
        System.out.println(p1.getNome());
        System.out.println(p1.getMatricula());
    }
}
