package comanda;

public class Comanda {
	private String produto;
	private int quantidade;
	private double preco;
	private double total;
	
	public Comanda(String produto, int quantidade, double preco, double total) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.total = total;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	

	
}
