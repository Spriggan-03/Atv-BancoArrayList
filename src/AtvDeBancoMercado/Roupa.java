package AtvDeBancoMercado;
import java.util.List;

public class Roupa extends Produto { // Classe pega herança da classe Produto
   private String tamanho; 
   private String material; 

   public Roupa(String codigo, String nome, double preco, String tamanho, String material) { // Construtor com parâmetros
       super(codigo, nome, preco); // Chama construtor da classe pai (classe produto)
       this.tamanho = tamanho; // Inicializa tamanho
       this.material = material; // Inicializa material
   }

   public Roupa() { // Construtor vazio
   }

   // Getters e Setters
   public String getTamanho() { // Getter para tamanho
       return tamanho; // Retorna o tamanho
   }

   public void setTamanho(String tamanho) { // Setter para tamanho
       this.tamanho = tamanho; // Define o tamanho
   }

   public String getMaterial() { // Getter para material
       return material; // Retorna o material
   }

   public void setMaterial(String material) { // Setter para material
       this.material = material; // Define o material
   }

   public void exibirDetalhes() { // Método para exibir detalhes da roupa
       System.out.println("Código.........: " + getCodigo()); 
       System.out.println("Nome...........: " + getNome()); 
       System.out.println("Preço..........: " + getPreco()); 
       System.out.println("Tamanho........: " + getTamanho()); 
       System.out.println("Material.......: " + getMaterial()); 
   }

   public static void iniciarRoupa(List<Roupa> roupas) { // Método para exibir lista de roupas
       for (Roupa dados : roupas) { // Itera sobre a lista
           dados.exibirDetalhes(); // Exibe detalhes de cada roupa
           System.out.println(); 
       }
   }

   @Override
   public String toString() { // Sobrescrita do método toString
       return super.toString() + " Roupa [tamanho=" + tamanho + ", material=" + material + "]"; // Retorna representação em string
   }
}