package AtvDeBancoMercado;
import java.util.List;

public class Eletronico extends Produto { // Classe pega herança da classe Produto
   private String marca; 
   private int garantiaMeses; 

   public Eletronico(String codigo, String nome, double preco, String marca, int garantiaMeses) { // Construtor com parâmetros
       super(codigo, nome, preco); // Chama construtor da classe pai (classe produto)
       this.marca = marca; // Inicializa marca
       this.garantiaMeses = garantiaMeses; // Inicializa garantia
   }

   public Eletronico() { // Construtor vazio
   }

   // Getters e Setters
   public String getMarca() { // Getter para marca
       return marca; // Retorna a marca
   }

   public void setMarca(String marca) { // Setter para marca
       this.marca = marca; // Define a marca
   }

   public int getGarantiaMeses() { // Getter para garantia
       return garantiaMeses; // Retorna a garantia em meses
   }

   public void setGarantiaMeses(int garantiaMeses) { // Setter para garantia
       this.garantiaMeses = garantiaMeses; // Define a garantia em meses
   }

   public void exibirDetalhes() { // Método para exibir detalhes do eletrônico
       System.out.println("Código.........: " + getCodigo());
       System.out.println("Nome...........: " + getNome()); 
       System.out.println("Preço..........: " + getPreco()); 
       System.out.println("Marca..........: " + getMarca()); 
       System.out.println("Garantia.......: " + getGarantiaMeses() + " meses"); 
   }

   public static void iniciarEletronico(List<Eletronico> eletronicos) { // Método para exibir lista de eletrônicos
       for (Eletronico dados : eletronicos) { // Itera sobre a lista
           dados.exibirDetalhes(); // Exibe detalhes de cada eletrônico
           System.out.println(); 
       }
   }

   @Override
   public String toString() { // Sobrescrita do método toString
       return super.toString() + " Eletronico [marca=" + marca + ", garantiaMeses=" + garantiaMeses + "]"; // Retorna representação em string
   }
}