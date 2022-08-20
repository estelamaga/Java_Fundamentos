public class Switch {
    public static void main(String[] args) {
        int numero = 7;

        switch (numero){
            case 1:
                System.out.println("O numero é 1");
                break;
            case 2:
                System.out.println("O numero é 2");
                break;
            case 5:
                System.out.println("O numero é 5");
                break;
            default:
                System.out.println("O numero é " + numero);
                break;
        }
    }
}
