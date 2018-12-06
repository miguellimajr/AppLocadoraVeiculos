package negocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Carro {
	
	private int id;
	private String nome; 
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private float valorCarro;	
	private float seguro;
	//private String adicionais[];	
	private List<String> lista = new ArrayList<String>(); 
	
	
	
	
	public Carro() {
		
	}
	

	public Carro(String nome, String placa, String marca, String modelo, int ano, float valorCarro, float seguro) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorCarro = valorCarro;
		this.seguro = seguro;		
		this.imprimirTipo();
	}

	


	public Carro(int id, String nome, String placa, String marca, String modelo, int ano, float valorCarro,
			float seguro) {
		super();
		this.id = id;
		this.nome = nome;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorCarro = valorCarro;
		this.seguro = seguro;
	}


	public void exibe() {
		
		System.out.printf("Carro: %s \n"
				+"Placa: %s \n"
				+"Marca: %s \n"
				+"Modelo: %s \n"
				+"Ano: %d \n"
				+"Valor do Carro: %.2f \n"
				+"Valor do Seguro: %.2f \n",
				
								
				nome, placa, marca, modelo,ano, valorCarro,seguro);		
							
	}
	
	
	protected static void adicionarCabecalho(String nomeClasse) {
		System.out.printf("\n#%s#\n\n", nomeClasse);
		
	}
	
	
	 public abstract void imprimirTipo();
	 

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(float valorCarro) {
		this.valorCarro = valorCarro;
	}

	
	public float getSeguro() {
		return seguro;
	}

	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}

	/*public String[] getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(String[] adicionais) {
		this.adicionais = adicionais;
	}*/

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	

}
