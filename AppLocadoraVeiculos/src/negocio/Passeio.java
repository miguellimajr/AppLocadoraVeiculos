package negocio;

public class Passeio extends Carro{
	
	
	private String tipoDeTeto;
	private String tipoDeBanco;
	private String radio;

	@Override
	public void imprimirTipo() {
		super.adicionarCabecalho("Carro de Passeio");
		
	}

	public Passeio() {
		super();
		
	}

	public Passeio(int id, String nome, String placa, String marca, String modelo, int ano, float valorCarro, float seguro, String tipodeTeto, String tipoDeBanco, String radio) {
		super(id, nome, placa, marca, modelo, ano, valorCarro, seguro);
		this.tipoDeTeto = tipodeTeto;
		this.tipoDeBanco = tipoDeBanco;
		this.radio = radio;
		
	}
	
	public Passeio(String nome, String placa, String marca, String modelo, int ano, float valorCarro, float seguro, String tipodeTeto, String tipoDeBanco, String radio) {
		super(nome, placa, marca, modelo, ano, valorCarro, seguro);
		this.tipoDeTeto = tipodeTeto;
		this.tipoDeBanco = tipoDeBanco;
		this.radio = radio;
		
	}

	public Passeio(String nome, String placa, String marca, String modelo, int ano, float valorCarro, float seguro) {
		super(nome, placa, marca, modelo, ano, valorCarro, seguro);
				
	}

	
	
	public void exibe() {
		
		super.exibe();
			
			System.out.printf("Tipo de Teto: %s\n"
					+ "Tipo de Bancos: %s\n"
					+ "Rádio: %s\n\n",
					tipoDeTeto, tipoDeBanco, radio);			
								
		}
	
	public String getTipoDeTeto() {
		return tipoDeTeto;
	}

	public void setTipoDeTeto(String tipoDeTeto) {
		this.tipoDeTeto = tipoDeTeto;
	}

	public String getTipoDeBanco() {
		return tipoDeBanco;
	}

	public void setTipoDeBanco(String tipodeBanco) {
		this.tipoDeBanco = tipodeBanco;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	
	
}
