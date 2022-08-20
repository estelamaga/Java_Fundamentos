package EncapsulamentoProtecao; /* Quando adicionamos modificadores como private precisa
    criar um métddo Getter e Setters.
    Getter = um método público que serve para consultar dados.
    Getter nomenclatura = get_nome_do atributo.
 */

public class Conta {
    public final Cliente Cliente;
    int numero;
    private float saldo;
    private final float limite;

    // Construtor
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.Cliente = cliente;
    }

    // Método
    void sacar(float valor) {
        if (valor <= this.saldo + this.limite) {
            this.saldo = (this.saldo + this.limite - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

     //Método Getter do atributo Saldo
    public float getSaldo(){
        return this.saldo;
    }

    public float getLimite(){
        return this.limite;
    }
}
