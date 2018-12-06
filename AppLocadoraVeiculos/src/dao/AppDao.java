package dao;

import java.util.List;

public class AppDao {

	public static List<?> obterLista(String lista){
		
		//deve existir quantos cases forem necessários para contemplar todas as suas telas de lista
		switch (lista){
		case "clienteLista.jsp":
			return ClienteDao.obterLista();

		case "caminhaoLista.jsp":
			return CaminhaoDao.obterLista();
			
		default:
			break;
		}
		
		return null;
	}
}
