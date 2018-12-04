package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AppController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//request.setAttribute("usuarios", UsuarioDao.obterLista());
		
		request.getRequestDispatcher("usuarioLista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		
		//request.setAttribute("usuario", UsuarioDao.obterPorId(id));
		
		request.getRequestDispatcher("usuarioDetalhe.jsp").forward(request, response);
	}
}