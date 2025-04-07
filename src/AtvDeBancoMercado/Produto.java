package AtvDeBancoMercado;

public class Produto { // Classe base pai para os produtos
	private String codigo; 
	private String nome; 
	private double preco; 

	public Produto(String codigo, String nome, double preco) { // Construtor com parâmetros
		this.codigo = codigo; // Inicializa código
		this.nome = nome; // Inicializa nome
		this.preco = preco; // Inicializa preço
	}

	public Produto() { // Construtor vazio
	}

	// Getters e Setters
	public String getCodigo() { // Getter para código
		return codigo; // Retorna o código
	}

	public void setCodigo(String codigo) { // Setter para código
		this.codigo = codigo; // Define o código
	}

	public String getNome() { // Getter para nome
		return nome; // Retorna o nome
	}

	public void setNome(String nome) { // Setter para nome
		this.nome = nome; // Define o nome
	}

	public double getPreco() { // Getter para preço
		return preco; // Retorna o preço
	}

	public void setPreco(double preco) { // Setter para preço
		this.preco = preco; // Define o preço
	}

	public void exibirIformacoes() { // Método para exibir informações básicas do produto
		System.out.println("Nome...........: " + this.nome); 
		System.out.println("Código.........: " + this.codigo); 
		System.out.println("Preço..........: " + this.preco); 
	}
}