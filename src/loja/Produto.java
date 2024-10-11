package loja;


public class Produto {

	private String nome;
	private Double preco; 
	private Integer quantidade;
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected Double getPreco() {
		return preco;
	}
	protected void setPreco(Double preco) {
		this.preco = preco;
	}
	protected Integer getQuantidade() {
		return quantidade;
	}
	protected void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produto [Nome do produto = " + nome + ", Preço do produto = " + preco + ", quantidade de produtos = " + quantidade + "]";
	}
	
	 
	
	
}
