package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Database.SingletonConnection;
import Model.Cliente;

public class ClienteDAO {

	public static void save(Cliente cliente) {

		String sql = "INSERT INTO Clientes (nome, cpf , email , nascimento , sexo , estado_civil , telefone , CEP , estado, cidade , longadouro , numero , observacao )  VALUES (?,?,?,?,?,?, ?,?, ?, ?, ?,? , ?)";

		Connection connection = null;
		PreparedStatement stmt = null;

		try {
			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getNascimento());
			stmt.setString(5, (String) cliente.getSexo());
			stmt.setString(6, (String) cliente.getEstado_civil());
			stmt.setString(7, cliente.getTelefone());
			stmt.setString(8, cliente.getCEP());
			stmt.setString(9, (String) cliente.getEstado());
			stmt.setString(10, cliente.getCidade());
			stmt.setString(11, cliente.getLongadouro());
			stmt.setString(12, cliente.getNumero());
			stmt.setString(13, cliente.getObservacao());

			stmt.execute();

			System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso!");

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
	
	
	public static List<Cliente> getCliente() {
		
		String sql = "select clientes.id, clientes.nome, clientes.cpf, clientes.email, clientes.nascimento, clientes.sexo, clientes.estado_civil, clientes.telefone, clientes.estado, clientes.cidade, clientes.longadouro, clientes.numero, clientes.observacao from clientes ORDER BY id ASC, nome ASC";
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		
		Connection connection = null;
		PreparedStatement stmt = null;

		ResultSet result = null;
		
		try {
			
			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			result = stmt.executeQuery();
			
			while (result.next()) {
				Cliente cliente = new Cliente.ClienteBuilder()
						.id(result.getInt("id"))
						.nome(result.getString("nome"))
						.cpf(result.getString("cpf"))
						.email(result.getString("email"))
						.nascimento(result.getString("nascimento"))
						.sexo(result.getString("sexo"))
						.estado_civil(result.getString("estado_civil"))
						.telefone(result.getString("telefone"))
						.estado(result.getString("estado"))
						.cidade(result.getString("cidade"))
						.longadouro(result.getString("longadouro"))
						.numero(result.getString("numero"))
						.observacao(result.getString("observacao"))
						.criarCliente();
				
				clientes.add(cliente);
				
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
		return clientes;
		
	}
	
	
	
	public static void delete(int id) {

		String sql = "DELETE FROM Clientes WHERE id=?";

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
	
	
	public static void update(Cliente cliente) {

		String sql = "UPDATE Clientes SET nome=?, cpf=?, email=?, nascimento=?, sexo=?, estado_civil=?, telefone=?, estado=?, cidade=?, longadouro=?, numero=?, observacao=? WHERE id=?";

		Connection connection = null;
		PreparedStatement stmt = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEmail());
			stmt.setString(4, cliente.getNascimento());
			stmt.setString(5, (String) cliente.getSexo());
			stmt.setString(6, (String) cliente.getEstado_civil());
			stmt.setString(7, cliente.getTelefone());
			stmt.setString(8, (String) cliente.getEstado());
			stmt.setString(9, cliente.getCidade());
			stmt.setString(10, cliente.getLongadouro());
			stmt.setString(11, cliente.getNumero());
			stmt.setString(12, cliente.getObservacao());
			

			stmt.setInt(13, cliente.getId());

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
	
	
	
	
	public static List<Cliente> buscarPorNome(String Nome) {
		String sql = "select clientes.id, clientes.nome, clientes.cpf, clientes.email, clientes.nascimento, clientes.sexo, clientes.estado_civil, clientes.telefone, clientes.estado, clientes.cidade, clientes.longadouro, clientes.numero, clientes.observacao from Clientes WHERE nome LIKE ?";
		List<Cliente> clientes = new ArrayList<Cliente>();

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {

			connection = SingletonConnection.getConnection();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, "%"+Nome+"%");

			result = stmt.executeQuery();

			while (result.next()) {
				Cliente cliente = new Cliente.ClienteBuilder()
						.id(result.getInt("id"))
						.nome(result.getString("nome"))
						.cpf(result.getString("cpf"))
						.email(result.getString("email"))
						.nascimento(result.getString("nascimento"))
						.sexo(result.getString("sexo"))
						.estado_civil(result.getString("estado_civil"))
						.telefone(result.getString("telefone"))
						.estado(result.getString("estado"))
						.cidade(result.getString("cidade"))
						.longadouro(result.getString("longadouro"))
						.numero(result.getString("numero"))
						.observacao(result.getString("observacao"))
						.criarCliente();

				clientes.add(cliente);
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

		return clientes;
		
		
	}
	
	
}
