package Model;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String nascimento;
	private Object sexo;
	private Object estado_civil;
	private String telefone;
	private String CEP;
	private Object estado;
	private String cidade;
	private String longadouro;
	private String numero;
	private String observacao;
	

	private Cliente(int id, String nome, String cpf, String email, String nascimento, Object sexo, Object estado_civil,
			String telefone,  String CEP, Object estado, String cidade, String longadouro, String numero, String observacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.telefone = telefone;
		this.CEP = CEP;
		this.estado = estado;
		this.cidade = cidade;
		this.longadouro = longadouro;
		this.numero = numero;
		this.observacao = observacao;
	}
	
	
	public static class ClienteBuilder {
		
		private int id;
		private String nome;
		private String cpf;
		private String email;
		private String nascimento;
		private Object sexo;
		private Object estado_civil;
		private String telefone;
		private String CEP;
		private Object estado;
		private String cidade;
		private String longadouro;
		private String numero;
		private String observacao;
		
		public ClienteBuilder() {}

		public ClienteBuilder id(int id) {
			this.id = id;
			return this;
		}
		public ClienteBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		public ClienteBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		public ClienteBuilder email(String email) {
			this.email = email;
			return this;
		}
		public ClienteBuilder nascimento(String nascimento) {
			this.nascimento = nascimento;
			return this;
		}
		
		public ClienteBuilder CEP(String cep) {
			this.CEP = cep;
			return this;
		}
		
		public ClienteBuilder sexo(Object object) {
			this.sexo = object;
			return this;
		}
		public ClienteBuilder estado_civil(Object estado_civil) {
			this.estado_civil = estado_civil;
			return this;
		}
		
		public ClienteBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}
		public ClienteBuilder estado(Object estado) {
			this.estado = estado;
			return this;
		}
		public ClienteBuilder cidade(String cidade) {
			this.cidade = cidade;
			return this;
		}
		public ClienteBuilder longadouro(String longadouro) {
			this.longadouro = longadouro;
			return this;
		}
		public ClienteBuilder numero(String numero) {
			this.numero = numero;
			return this;
		}
		public ClienteBuilder observacao(String observacao) {
			this.observacao = observacao;
			return this;
		}
		
		public Cliente criarCliente() {
			return new Cliente( id, nome, cpf, email,nascimento,  sexo,  estado_civil,telefone, CEP, estado, cidade, longadouro, numero, observacao);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Object getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Object getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Object getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLongadouro() {
		return longadouro;
	}

	public void setLongadouro(String longadouro) {
		this.longadouro = longadouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

}
