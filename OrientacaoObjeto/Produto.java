/*
    Classes:
        O nome deve iniciar com letra Maíuscula
        O nome não deve conter acentuação, caracteres especiais e espaço
        Não existe a implementação da função main
        Forma: public class NomeDaClasse{
        }
        O nome da classe deve ser o mesmo nome do arquivo.
 */

/*
    Atributos: São as caracteristicas da classe / modelo / modelo de dados
    Outra forma de nomenclatura para atributos são estados
    Atributos são nomeados com letras minusculas, sem espaços, sem caracteres especiais e sem acentuação
 */

/*
    Métodos: São comportamentos da classe
    Forma:
        1 - Tipo de retorno (tipo de dados que vai retornar)
        2 - Nome - Correspondente a ação que o método realiza
        3 - Parâmetros / Arguementos de entrada(Opcional)
        4 - Retorno - (Opcional - depende do tipo de  retorno)

 */
public class Produto {
    String nome;
    float preco;
    float desconto;


    // Método para aumentar o preço em 10
    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }
}
