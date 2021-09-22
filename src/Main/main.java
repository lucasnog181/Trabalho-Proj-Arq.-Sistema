package Main;

import Controller.ClienteControllers;
import Controller.FuncionarioControllers;
import Controller.ProdutoControllers;
import Model.Cliente;
import Model.Funcionario;
import Model.Produto;

public class main {
	public static void main(String[] args) {

		ProdutoControllers produtoDAO = new ProdutoControllers();
		FuncionarioControllers funcionarioDAO = new FuncionarioControllers();

		Produto produto = new Produto.ProdutoBuilder()
				.codigo_produto(1)
				.nome_produto("TEst")
				.descricao_produto("TEST")
				.tipo_produto("test")
				.valor_produto("Test")
				.criarProduto();

		// produtoDAO.save(produto);
		// produtoDAO.update(produto);
		// produtoDAO.delete(Codigo_produto);

		for (Produto p : produtoDAO.getProdutos()) {
			// System.out.println("Produtos: " + p.getNome_produto());
		}

		for (Produto p : produtoDAO.buscarPorNome("iPhone")) {
			System.out.println("Produtos: " + p.getNome_produto());
		}

	}
}
