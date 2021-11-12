package Controllres;

import java.util.List;

import DAO.ClienteDAO;
import Model.Cliente;

public class ClienteControllers {

	  public static String salvar(Cliente cliente){
		  String resposta = null;
		  try {
			  ClienteDAO.save(cliente);
			  
		} catch (Exception e) {
			  e.printStackTrace();
	          resposta = "Erro na fonte de dados";
		}
		return resposta;    
	  }
	
	  
	  public static List<Cliente> procurar(String nome){
		  List<Cliente> listaResposta = null;
		  
		  try{
	            if (nome == null || "".equals(nome)) {
	              
	                listaResposta = ClienteDAO.getCliente() ;
	            } else {
	              
	                listaResposta = ClienteDAO.buscarPorNome(nome);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return listaResposta;
	  }
	  
	  
	  public static String atualizar(Cliente cliente) {
		  String resposta = null;
	        try{
	            ClienteDAO.update(cliente);
	        } 
	        catch (Exception e){   
	            e.printStackTrace();
	            resposta = "Erro na fonte de dados";
	        }
	        return resposta;        
	  }
	  
	  
	  public static String excluir(Integer id) {
	        String resposta = null;

	        try {   
	          
	            ClienteDAO.delete(id);
	        } catch (Exception e) {
	            e.printStackTrace();
	            resposta = "Erro na fonte de dados";
	        }
	        return resposta;
	    }
}
