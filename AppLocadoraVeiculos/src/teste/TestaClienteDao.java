package teste;

import negocio.Cliente;
import dao.ClienteDao;

public class TestaClienteDao {
	
	
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("João");
		cliente.setCpf("124.345.397-07");
		cliente.setTelefone("2334-0898");
		cliente.setEndereco("Rua A");
		cliente.setIdade(30);
		cliente.setRendaMensal(500000);	
		
		ClienteDao.incluir(cliente);
		
		
		for (Cliente c: ClienteDao.obterLista()) {
			c.exibe();
		
	
		
		
	}

}
}
