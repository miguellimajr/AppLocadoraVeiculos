package negocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Garagem implements Interface{
	
	int id;
	Carro carro;
	List<Carro> carros = new ArrayList<Carro>();
	Calendar data = Calendar.getInstance();
	
	
	public void CalculaPatrimonio() {
		
		float patrimonio = 0;
		
		for (Carro carro : carros) {
			patrimonio = patrimonio + carro.getValorCarro();
		}
		
		System.out.printf("A soma dos valores dos carros na garagem é de R$ %.2f \n\n",patrimonio);	
		
	}
	
	
	public void ReavaliaValor() {
		
		for (Carro carro : carros) {
			if ((carro.getAno())<(data.get(Calendar.YEAR)-2)) {	
				
				float auxiliar = ((data.get(Calendar.YEAR) - carro.getAno())*10);
				carro.setValorCarro(carro.getValorCarro()*(1-(auxiliar)/100));
				
				System.out.printf("O Carro de placa %s sofreu uma depreciação de %.0f %%. \n\n",carro.getPlaca(),auxiliar);
				
				
			}
		}
	}
	
	public void ExibeGaragem() {
		
		for (Carro carro : carros) {
			carro.exibe();
		}
	}
				
						
	public void EstacionaCarro(Carro carro) {
		
		carros.add(carro);		
		
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


	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public List<Carro> getCarros() {
		return carros;
	}


	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}

}
