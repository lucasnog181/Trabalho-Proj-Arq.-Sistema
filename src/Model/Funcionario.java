package Model;



public class Funcionario {

	private int id;
	private String nome;
	private String cpf;
	private String data_contratacao ;
	private String salario;
	private Object cargo;
	



	private Funcionario(int id, String nome, String cpf, String data_contratacao, String salario, Object cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.data_contratacao = data_contratacao;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	
	public static class FuncionarioBuilder {
		
		private int id;
		private String nome;
		private String cpf;
		private String data_contratacao ;
		private String salario;
		private Object cargo;
		
		
		public FuncionarioBuilder id(int id) {
			this.id = id;
			return this;
		}
		
		
		public FuncionarioBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		
		public FuncionarioBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		
		public FuncionarioBuilder data_contratacao(String data_contratacao) {
			this.data_contratacao = data_contratacao;
			return this;
		}
		
		
		public FuncionarioBuilder salario(String salario) {
			this.salario = salario;
			return this;
		}
		
		public FuncionarioBuilder cargo(Object cargo) {
			this.cargo = cargo;
			return this;
		}
		
		 
		public Funcionario criarFuncionario() {
			return new Funcionario(id, nome, cpf, data_contratacao, salario ,cargo );
		}
		
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData_contratacao() {
		return data_contratacao;
	}
	public void setData_contratacao(String data_contratacao) {
		this.data_contratacao = data_contratacao;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Object getCargo() {
		return cargo;
	}
	public void setCargo(Object cargo) {
		this.cargo = cargo;
	}
	
}
