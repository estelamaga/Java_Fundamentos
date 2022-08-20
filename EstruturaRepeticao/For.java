import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        int idade;
        String nome;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            // BUG => idade = teclado.nextInt();
            idade = Integer.parseInt(teclado.nextLine());
        }

        teclado.close();
    }
}
