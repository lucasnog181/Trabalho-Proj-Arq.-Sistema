package Controllres;

import java.util.List;

import DAO.ProdutoDAO;
import Model.Produto;

public class ProdutoControllers {

	public static String salvar(Produto produto) {
		String resposta = null;
		try {
			ProdutoDAO.save(produto);

		} catch (Exception e) {
			e.printStackTrace();
			resposta = "Erro na fonte de dados";
		}
		return resposta;
	}

	public static List<Produto> procurar(String nome) {
		List<Produto> listaResposta = null;

		try {
			if (nome == null || "".equals(nome)) {

				listaResposta = ProdutoDAO.getProdutos();
			} else {

				listaResposta = ProdutoDAO.buscarPorNome(nome);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaResposta;
	}

	public static String atualizar(Produto produto) {
		String resposta = null;
		try {
			ProdutoDAO.update(produto);
		} catch (Exception e) {
			e.printStackTrace();
			resposta = "Erro na fonte de dados";
		}
		return resposta;
	}

	public static String excluir(Integer id) {
		String resposta = null;

		try {

			ProdutoDAO.delete(id);

		} catch (Exception e) {
			e.printStackTrace();
			resposta = "Erro na fonte de dados";
		}
		return resposta;
	}

}
