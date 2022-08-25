public class ContaBancaria {
    private int numero;
    private String cliente;

    public static int contador = 1;

    public ContaBancaria(String cliente){
        this.numero = contador;
        this.cliente = cliente;
        ContaBancaria.contador = ContaBancaria.contador + 1;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
