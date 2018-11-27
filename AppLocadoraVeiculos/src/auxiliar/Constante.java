package auxiliar;

public class Constante {

	private static final float TX_DESCONTO = 10;
	
	private static final String ADICIONAIS_BASICOS[] = {"ABS", "Teto Solar", "Bancos de Couro", "Rádio Bluetooth"};

	public static float getTxDesconto() {
		return TX_DESCONTO;
	}

	public static String[] getAdicionaisBasicos() {
		return ADICIONAIS_BASICOS;
	}
}
