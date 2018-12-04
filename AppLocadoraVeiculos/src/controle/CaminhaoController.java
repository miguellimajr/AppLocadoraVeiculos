package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CaminhaoDao;

public class CaminhaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CaminhaoController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		
		CaminhaoDao.excluir(id);
		
		request.setAttribute("clientes", CaminhaoDao.obterLista());
		
		request.getRequestDispatcher("caminhaolista.jsp").forward(request, response);
	}
}