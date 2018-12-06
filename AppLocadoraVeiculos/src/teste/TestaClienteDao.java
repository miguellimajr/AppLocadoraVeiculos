package teste;

import negocio.*;
import dao.*;

public class TestaClienteDao {
	
	
	public static void main(String[] args) {		
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("João");
		cliente.setCpf("124.345.397-07");
		cliente.setTelefone("2334-0898");
		cliente.setEndereco("Rua A");
		cliente.setIdade(30);
		cliente.setRendaMensal(500000);	
		
		//ClienteDao.incluir(cliente);
		
		
		for (Cliente c: ClienteDao.obterLista()) {
			c.exibe();		
		}
		
		
		Passeio passeio = new Passeio("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 1500,"Teto Solar", "Banco de Couro", "Bluetooth");
		Caminhao caminhao = new Caminhao ("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 1500, 2, "Baú");
		
		PasseioDao.incluir(passeio);
		CaminhaoDao.incluir(caminhao);
		
		
		for (Passeio p: PasseioDao.obterLista()) {
			p.exibe();		
		}
		
		for (Caminhao c: CaminhaoDao.obterLista()) {
			c.exibe();		
		}
		
		
		
		
		
		
		
		
		
		

}
}
