package AtvDeBancoMercado;
import java.util.List;

public class Alimento extends Produto { // Classe pega herança da classe Produto
   private String dataValidade; 
   private String categoria; 

   public Alimento(String codigo, String nome, double preco, String dataValidade, String categoria) { // Construtor com parâmetros
       super(codigo, nome, preco); // Chama construtor da classe pai (classe produto)
       this.dataValidade = dataValidade; // Inicializa data de validade
       this.categoria = categoria; // Inicializa categoria
   }

   public Alimento() { // Construtor vazio
   }

   // Getters e Setters
   public String getDataValidade() { // Getter para data de validade
       return dataValidade; // Retorna a data de validade
   }

   public void setDataValidade(String dataValidade) { // Setter para data de validade
       this.dataValidade = dataValidade; // Define a data de validade
   }

   public String getCategoria() { // Getter para categoria
       return categoria; // Retorna a categoria
   }

   public void setCategoria(String categoria) { // Setter para categoria
       this.categoria = categoria; // Define a categoria
   }

   public void exibirDetalhes() { // Método para exibir detalhes do alimento

       System.out.println("Código.........: " + getCodigo()); 
       System.out.println("Nome...........: " + getNome()); 
       System.out.println("Preço..........: " + getPreco()); 
       System.out.println("Validade.......: " + getDataValidade()); 
       System.out.println("Categoria......: " + getCategoria()); 
   }

   public static void iniciarAlimento(List<Alimento> alimentos) { // Método para exibir lista de alimentos
       for (Alimento dados : alimentos) { // Itera sobre a lista
           dados.exibirDetalhes(); // Exibe detalhes de cada alimento
           System.out.println(); 
       }
   }

   @Override
   public String toString() { // Sobrescrita do método toString
       return super.toString() + " Alimento [dataValidade=" + dataValidade + ", categoria=" + categoria + "]"; // Retorna representação em string
   }


}