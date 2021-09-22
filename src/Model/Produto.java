package Model;

public class Produto {

	private int codigo_produto;
	private String nome_produto;
	private String descricao_produto;
	private String tipo_produto;
	private String valor_produto;

	private Produto(int codigo_produto, String nome_produto, String descricao_produto, String tipo_produto,
			String valor_produto) {
		super();
		this.codigo_produto = codigo_produto;
		this.nome_produto = nome_produto;
		this.descricao_produto = descricao_produto;
		this.tipo_produto = tipo_produto;
		this.valor_produto = valor_produto;

	}

	public static class ProdutoBuilder {
		private int codigo_produto;
		private String nome_produto;
		private String descricao_produto;
		private String tipo_produto;
		private String valor_produto;

		public ProdutoBuilder() {
		}

		public ProdutoBuilder codigo_produto(int codigo_produto) {
			this.codigo_produto = codigo_produto;
			return this;
		}

		public ProdutoBuilder nome_produto(String nome_produto) {
			this.nome_produto = nome_produto;
			return this;
		}

		public ProdutoBuilder descricao_produto(String descricao_produto) {
			this.descricao_produto = descricao_produto;
			return this;
		}

		public ProdutoBuilder tipo_produto(String tipo_produto) {
			this.tipo_produto = tipo_produto;
			return this;
		}

		public ProdutoBuilder valor_produto(String valor_produto) {
			this.valor_produto = valor_produto;
			return this;
		}

		public Produto criarProduto() {
			return new Produto(codigo_produto, nome_produto, descricao_produto, tipo_produto, valor_produto);
		}

	}

	public int getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public String getTipo_produto() {
		return tipo_produto;
	}

	public void setTipo_produto(String tipo_produto) {
		this.tipo_produto = tipo_produto;
	}

	public String getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(String valor_produto) {
		this.valor_produto = valor_produto;
	}

}
