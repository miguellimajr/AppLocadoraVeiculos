package teste;

import auxiliar.Constante;
import negocio.Cliente;
import negocio.Emprestimo;
import negocio.Passeio;

public class TestaAluguel {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente("123.476.348-09", "João Silva", "9876-5432", "Centro", 30, 4000);
				
		Passeio gol = new Passeio("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 1500);
		
		
		Emprestimo e = new Emprestimo();
		e.setCarro(gol);
		e.setCliente(joao);
		
		e.exibe();
		
		
		e.consultaAluguel();
		
		



		
		
		

	
			

		
	}
	
	

}
