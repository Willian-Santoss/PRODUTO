package Ex1;


public class PRODUTO {      //Classe pública externa 'PRODUTO'
    String modelo;          //Atributo da classe 'PRODUTO'
    String marca;           //Atributo da classe 'PRODUTO'
    String tamanho;         //Atributo da classe 'PRODUTO'
    double valvenda;        //Atributo da classe 'PRODUTO'
    double valcusto = 200;  //Atributo da classe 'PRODUTO'
    double lucro;           //Atributo da classe 'PRODUTO'
   
    PRODUTO(String modelo, String marca, String tamanho, double valvenda){  //Construtor com os parâmetros declarados
        this.modelo = modelo;              //Atribui o valor do parâmetro modelo ao atributo modelo.
        this.marca = marca;                //Atribui o valor do parâmetro marca ao atributo marca.
        this.tamanho = tamanho;            //Atribui o valor do parâmetro tamanho ao atributo tamanho.
        this.valvenda = valvenda;          //Atribui o valor do parâmetro valvenda ao atributo valvenda.
        this.lucro = valvenda - valcusto;  //Atribui o valor do parâmetro lucro como 'atributo valvenda - valcusto'.
    }
    String descricao() {  //Método que retorna no main a descrição detalhada
        return
                "Modelo: " + this.modelo + "\n" +
                "Marca: " + this.marca + "\n" +
                "Tamanho: " + this.tamanho + "\n" +
                "Valor de custo: " + this.valcusto + "\n" +
                "Valor de venda: " + this.valvenda + "\n" +
                "Lucro da venda: " + lucro;
    }

public static class PESSOAS {   // Classe publica estatica 'PESSOAS' pois não é possivel ter 2 classes públicas no mesmo código
        String nome;            //Atributo da classe 'PESSOAS'
        String sobrenome;       //Atributo da classe 'PESSOAS'
        double altura;          //Atributo da classe 'PESSOAS'
        String dataNasc;        //Atributo da classe 'PESSOAS'
        String email;           //Atributo da classe 'PESSOAS'
        
        PESSOAS (String nome, String sobrenome, double altura, String dataNasc){ //Construtor com os atributos declarados sem o atributo email, pois ele sera gerado pelo 'gerarEmail'
        	//Atribuição de valores de parâmetros aos atributos
        	this.nome = nome;  
            this.sobrenome = sobrenome;
            this.dataNasc = dataNasc;
            this.altura = altura;
            this.email = gerarEmail(); //Parâmetro que chama o private 'gerarEmail'
        }

		private String gerarEmail() { //Private onde gera o email da pessoa
            return
            		"Seu email é: " + this.nome + "." + this.sobrenome + "@dominio.com";

        }
}

    public static void main(String[] args) { //Método main onde as informações que serão mostradas são declaradas
        PRODUTO c1 = new PRODUTO("Camisa Corinthians.1 - Jogador", "Nike", "G", 600); //Instância 'c1' que declara informações para os atributos da classe 'PRODUTO'
        System.out.println(c1.descricao());                                           //Chama o método descrição com as informações que foram declaradas na instância 'c1'
        
        System.out.println(" ");
        
        PESSOAS pessoa = new PESSOAS("Willian", "Santos", 1.87, "13/05/2005");        //Instância 'pessoa' que declara informações para os atributos da classe 'PESSOAS'
        System.out.println("Nome completo: " + pessoa.nome + " " + pessoa.sobrenome); //Mostra o nome completo da pessoa com as informações declarados em 'pessoa'
        System.out.println("Altura: " + pessoa.altura);                               //Mostra a altura da pessoa com a informação declarada em 'pessoa'
        System.out.println("Data de nascimento: " + pessoa.dataNasc);                 //Mostra a altura da pessoa com a informação declarada em 'pessoa'
        System.out.println(pessoa.email);                                             //Mostra o email chamado pelo parâmetro 'email', gerado automaticamente pelo private 'gerarEmail' com as informações declaradas em 'pessoa'
    }
}
