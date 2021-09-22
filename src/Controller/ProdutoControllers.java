package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.SingletonConnection;
import Model.Produto;

public class ProdutoControllers {

	public void save(Produto produto) {

		String sql = "INSERT INTO Produtos ( Nome_produto, Descricao_produto , Tipo_produto , Valor_produto) VALUES (?,?,?,?)";
		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome_produto());
			stmt.setString(2, produto.getDescricao_produto());
			stmt.setString(3, produto.getTipo_produto());
			stmt.setString(4, produto.getValor_produto());

			stmt.execute();

			System.out.println("Produto "+ produto.getNome_produto() + " cadastrado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				} else if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public List<Produto> getProdutos() {

		String sql = "select produtos.Codigo_produto, produtos.Nome_produto, produtos.Descricao_produto, produtos.Tipo_produto, produtos.Valor_produto from produtos ORDER BY Codigo_produto ASC, Nome_produto ASC";

		List<Produto> produtos = new ArrayList<Produto>();

		Connection connection = null;
		PreparedStatement stmt = null;

		ResultSet result = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			result = stmt.executeQuery();

			while (result.next()) {
				Produto produto = new Produto.ProdutoBuilder().codigo_produto(result.getInt("Codigo_produto"))
						.nome_produto(result.getString("Nome_produto")).descricao_produto(result.getString("Descricao_produto")).tipo_produto(result.getString("Tipo_produto"))
						.valor_produto(result.getString("Valor_produto")).criarProduto();

				produtos.add(produto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				} else if (stmt != null) {
					stmt.close();
				} else if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return produtos;

	}

	public void update(Produto produto) {

		String sql = "UPDATE Produtos SET Nome_produto=?, Descricao_produto=?, Tipo_produto=?, Valor_produto=? WHERE Codigo_produto=?";

		Connection connection = null;
		PreparedStatement stmt = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, produto.getNome_produto());
			stmt.setString(2, produto.getDescricao_produto());
			stmt.setString(3, produto.getTipo_produto());
			stmt.setString(4, produto.getValor_produto());

			stmt.setInt(5, produto.getCodigo_produto());

			stmt.execute();

			System.out.println("Dados Atualizado com sucesso !");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				} else if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(int Codigo_produto) {

		String sql = "DELETE FROM Produtos WHERE Codigo_produto=?";

		Connection connection = null;
		PreparedStatement stmt = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, Codigo_produto);

			stmt.execute();
			System.out.println("Dados deletetado:" + Codigo_produto + "com sucesso !");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				} else if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	
	public List<Produto> buscarPorNome(String NomeProduto) {
		String sql = "SELECT produtos.Codigo_produto, produtos.Nome_produto, produtos.Tipo_produto, produtos.Valor_produto from Produtos WHERE Nome_produto LIKE ?";
		List<Produto> produtos = new ArrayList<Produto>();

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%"+NomeProduto+"%");

			result = stmt.executeQuery();

			while (result.next()) {
				Produto produto = new Produto.ProdutoBuilder().codigo_produto(result.getInt("Codigo_produto"))
						.nome_produto(result.getString("Nome_produto")).tipo_produto(result.getString("Tipo_produto"))
						.valor_produto(result.getString("Valor_produto")).criarProduto();

				produtos.add(produto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (result != null) {
					result.close();
				} else if (stmt != null) {
					stmt.close();
				} else if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return produtos;
		
		
	}

	
}
