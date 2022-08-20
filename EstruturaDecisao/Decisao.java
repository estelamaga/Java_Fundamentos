public class Decisao {
    public static void main(String[] args) {
        //Declarando a variavel e inicializando
        int numero = 7;
        if (numero > 5){
            System.out.println("Sim, o " + numero + " é maior que 5");
        } else if (numero == 5) {
            System.out.println("Sim, o " + numero + " é igual que 5");
        } else{
            System.out.println("Não, o " + numero + " é menor que 5");
        }
    }
}
