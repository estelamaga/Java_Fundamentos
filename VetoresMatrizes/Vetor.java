public class Vetor {
    public static void main(String[] args) {
        // Declarando e especificando o tamanho do vetor
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = i + 3;
        }
        System.out.println(numero[0]);
        System.out.println(numero[9]);

/*
        for (int i: numero) {
            System.out.println(i);
        }
*/
    }
}
