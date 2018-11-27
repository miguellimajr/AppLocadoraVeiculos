package negocio;

public class Cliente implements Interface{

	private int id;
	private String cpf;
	private String nome;
	private String telefone;
	private String endereco;
	private int idade;
	private float rendaMensal;

	public Cliente() {
		
	}

	public Cliente(String cpf, String nome, String telefone, String endereco, int idade, float rendaMensal) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.idade = idade;
		this.rendaMensal = rendaMensal;
	}
	
	

	public Cliente(int id, String cpf, String nome, String telefone, String endereco, int idade, float rendaMensal) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.idade = idade;
		this.rendaMensal = rendaMensal;
	}

	

	public void exibe() {

		System.out.printf("Nome do Cliente: %s \n"
				+"CPF: %s \n"
				+"Telefone: %s \n" 
				+"Endereço: %s \n"
				+"Idade: %d \n"
				+"Renda Mensal: R$ %.2f \n\n", 
				nome,
				cpf,
				telefone,
				endereco,
				idade,
				rendaMensal);

	}
	
	@Override
	public void imprimirTipo() {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroRegistro() {
		return cpf;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.cpf = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	
	
	
	

}
