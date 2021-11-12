package Controllres;

import java.util.List;
import DAO.FuncionarioDAO;
import Model.Funcionario;

public class FuncionariosControllers {

	 public static String salvar(Funcionario funcionario){
		  String resposta = null;
		  try {
			 FuncionarioDAO.save(funcionario);
			  
		} catch (Exception e) {
			  e.printStackTrace();
	          resposta = "Erro na fonte de dados";
		}
		return resposta;  
	 }
	 
	 
	  public static List<Funcionario> procurar(String nome){
		  List<Funcionario> listaResposta = null;
		  
		  try{
	            if (nome == null || "".equals(nome)) {
	              
	                listaResposta = FuncionarioDAO.getFuncionario() ;
	            } else {
	              
	                listaResposta = FuncionarioDAO.buscarPorNome(nome);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return listaResposta;
	  }
	
	  
	  
	  public static String atualizar(Funcionario funcionario) {
		  String resposta = null;
	        try{
	            FuncionarioDAO.update(funcionario);
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
	          
	        	FuncionarioDAO.delete(id);
	        } catch (Exception e) {
	            e.printStackTrace();
	            resposta = "Erro na fonte de dados";
	        }
	        return resposta;
	    }
}
