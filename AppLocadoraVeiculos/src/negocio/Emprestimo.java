package negocio;

import java.util.Calendar;

import auxiliar.Constante;

public class Emprestimo implements Interface{
	
	private int id;
	private Carro carro;
	private Cliente cliente;
	private Calendar data = Calendar.getInstance();
	private String formaDePagamento;
	
		
	
	public Emprestimo() {
		super();
	}


	public float calculaAluguel() {		
		
		return ((carro.getValorCarro() + carro.getSeguro())/100)*(1-(Constante.getTxDesconto()/100));
				
	}
	
	
	public Emprestimo(int id, String formaDePagamento) {
		super();
		this.id = id;
		this.formaDePagamento = formaDePagamento;
	}


	public boolean liberaAluguel() {
		if (cliente.getRendaMensal() >= (carro.getValorCarro()*0.05)) {
			return true;
		}
		
		return false;
	}
	
	
	public void consultaAluguel() {
		if (liberaAluguel()) {
			System.out.printf("No dia %s/%s o aluguel foi aprovado pelo Sistema.\n"
					+"Desconto promocional: %.0f %%\n"
					+"Valor da diaria: R$ %.2f\n",
					data.get(Calendar.DATE),
					data.get(Calendar.MONTH)+1,
					Constante.getTxDesconto(),
					calculaAluguel());			
			}
		else {
			System.out.printf("No dia %s/%s o aluguel não foi aprovado pelo Sistema.\n",
			data.get(Calendar.DATE),
			data.get(Calendar.MONTH)+1);
			
		}
			
		}
	
	
	
	public void exibe() {
		
		carro.exibe();
		cliente.exibe();
		
	}
	
	@Override
	public void imprimirTipo() {
		// TODO Auto-generated method stub
		
	}


	public Carro getCarro() {
		return carro;
	}



	public void setCarro(Carro carro) {
		this.carro = carro;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}


	public String getFormaDePagamento() {
		return formaDePagamento;
	}


	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}


	

}
