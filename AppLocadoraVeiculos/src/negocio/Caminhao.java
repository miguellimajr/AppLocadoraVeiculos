package negocio;

public class Caminhao extends Carro {
	
	
	private int eixos;
	private String tipoCacamba;	
	

	public Caminhao() {
		
		
	}	
		

	public Caminhao(int id, String nome, String placa, String marca, String modelo, int ano, float valorCarro,
			float seguro, int eixos, String tipoCacamba) {
		super(id, nome, placa, marca, modelo, ano, valorCarro, seguro);
		
		this.eixos = eixos;
		this.tipoCacamba = tipoCacamba;
		
	}


	@Override
	public void imprimirTipo() {		
		super.adicionarCabecalho("Caminhão");
		
	}


	public int getEixos() {
		return eixos;
	}


	public void setEixos(int eixos) {
		this.eixos = eixos;
	}


	public String getTipoCacamba() {
		return tipoCacamba;
	}


	public void setTipoCacamba(String tipoCacamba) {
		this.tipoCacamba = tipoCacamba;
	}
	
	
	
	
}
