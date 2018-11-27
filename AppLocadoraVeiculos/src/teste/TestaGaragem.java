package teste;

import negocio.Caminhao;
import negocio.Garagem;
import negocio.Passeio;
import auxiliar.Constante;

public class TestaGaragem {
	
	public static void main(String[] args) {
		Garagem garagem = new Garagem();
		
		Passeio gol = new Passeio("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2015, 50000, 15000, Constante.getAdicionaisBasicos());
		Passeio uno = new Passeio("Uno", "AXY-1053", "Fiat", "Motor 2.0", 2014, 75000, 20000, Constante.getAdicionaisBasicos());
		Passeio gol2 = new Passeio("Gol", "AXT-7050", "Volkswagen", "Motor 1.0", 2017, 40000, 10000, Constante.getAdicionaisBasicos());
		Passeio uno2 = new Passeio("Uno", "AGY-1853", "Fiat", "Motor 1.6", 2018, 70000, 18000, Constante.getAdicionaisBasicos());
		
		/*Caminhao golb = new Caminhao("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 15000, Constante.getAdicionaisBasicos());
		Caminhao unob = new Caminhao("Uno", "AXY-1053", "Fiat", "Motor 2.0", 2018, 75000, 20000, Constante.getAdicionaisBasicos());
		Caminhao gol2b = new Caminhao("Gol", "AXT-7050", "Volkswagen", "Motor 1.0", 2017, 40000, 10000, Constante.getAdicionaisBasicos());
		Caminhao uno2b = new Caminhao("Uno", "AGY-1853", "Fiat", "Motor 1.6", 2018, 70000, 18000, Constante.getAdicionaisBasicos());*/
		
		garagem.EstacionaCarro(gol);
		garagem.EstacionaCarro(uno);
		garagem.EstacionaCarro(gol2);
		garagem.EstacionaCarro(uno2);
		/*garagem.EstacionaCarro(golb);
		garagem.EstacionaCarro(unob);
		garagem.EstacionaCarro(gol2b);
		garagem.EstacionaCarro(uno2b);*/
		
		
		
		garagem.ExibeGaragem();
		garagem.CalculaPatrimonio();
		garagem.ReavaliaValor();
		garagem.ExibeGaragem();
		garagem.CalculaPatrimonio();

		






		
		
		
	}

}
