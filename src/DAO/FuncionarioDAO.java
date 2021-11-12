package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Database.SingletonConnection;
import Model.Funcionario;


public class FuncionarioDAO {

	public static void save(Funcionario funcionario) {

		String sql = "INSERT INTO Funcionarios (nome, cpf , data_contratacao , salario , cargo )  VALUES (?,?,?,?,?)";

		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getCpf());
			stmt.setString(3, funcionario.getData_contratacao());
			stmt.setString(4, funcionario.getSalario());
			stmt.setString(5, (String) funcionario.getCargo());

			stmt.execute();

			System.out.println("Cliente " + funcionario.getNome() + " cadastrado com sucesso!");

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
	
	
	public static List<Funcionario> getFuncionario() {
		
	String sql = "select funcionarios.id, funcionarios.nome, funcionarios.cpf, funcionarios.data_contratacao, funcionarios.cargo, funcionarios.salario from funcionarios ORDER BY id ASC, nome ASC";
		
	
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	Connection connection = null;
	PreparedStatement stmt = null;

	ResultSet result = null;
	
	
	try {
		
		connection = SingletonConnection.getConnection();
		stmt = connection.prepareStatement(sql);

		result = stmt.executeQuery();
		
		
		while (result.next()) {
			Funcionario funcionario = new Funcionario.FuncionarioBuilder()
					.id(result.getInt("id"))
					.nome(result.getString("nome"))
					.cpf(result.getString("cpf"))
					.data_contratacao(result.getString("data_contratacao"))
					.salario(result.getString("salario"))
					.cargo(result.getString("cargo"))
					.criarFuncionario();
			
			funcionarios.add(funcionario);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
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
	
		
		return funcionarios;
		
	}
	
	
	
	
	
	public static void update(Funcionario funcionario) {
		String sql = "UPDATE Funcionarios SET nome=?, cpf=?, data_contratacao=?, salario=?, cargo=?  WHERE id=?";
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			
			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getCpf());
			stmt.setString(3, funcionario.getData_contratacao());
			stmt.setString(4, funcionario.getSalario());
			stmt.setString(5, (String) funcionario.getCargo());
			
			stmt.setInt(6, funcionario.getId());

			stmt.execute();

			System.out.println("Dados Atualizado com sucesso !");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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

	
	
	
	public static void delete(int id) {
		String sql = "DELETE FROM Funcionarios WHERE id=?";
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			
			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, id);
			
			stmt.execute();
			System.out.println("Dados deletetado:" + id + "com sucesso !");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		
	
	
	public static List<Funcionario> buscarPorNome(String nome) {
		String sql = "select funcionarios.id, funcionarios.nome, funcionarios.cpf, funcionarios.data_contratacao, funcionarios.cargo, funcionarios.salario from funcionarios WHERE nome LIKE ? ORDER BY id ASC, nome ASC";
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%"+nome+"%");

			result = stmt.executeQuery();

			while (result.next()) {
				Funcionario funcionario = new Funcionario.FuncionarioBuilder()
						.nome(result.getString("nome"))
						.cpf(result.getString("cpf"))
						.data_contratacao(result.getString("data_contratacao"))
						.salario(result.getString("salario"))
						.cargo(result.getString("cargo"))
						.criarFuncionario();
				
				funcionarios.add(funcionario);
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

		return funcionarios;
		
		
	}

	

}
