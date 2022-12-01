package projetovacina.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetovacina.dao.UsuarioDao;
import projetovacina.models.Usuario;

@WebServlet({ "/ServletValidUser", "/controllerValidUser" })
public class ServletValidUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletValidUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDao dao = new UsuarioDao();
		Usuario user = new Usuario();
		String usuario = request.getParameter("nome");
		String senha = request.getParameter("senha");
		user = dao.login(usuario,senha);
		
		if(user == null) {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Usuário ou senha incorreto');");
			pw.println("</script>");
			RequestDispatcher rd=request.getRequestDispatcher("formLoginUsuario.jsp");
			rd.include(request, response);
		}
		else {
			response.sendRedirect("formMenuPrincipal.jsp");
		}
	}

}
