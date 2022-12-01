package projetovacina.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetovacina.dao.UsuarioDao;
import projetovacina.models.Usuario;

@WebServlet({ "/ServletUsuario", "/controllerUsuario" })
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		UsuarioDao dao = new UsuarioDao();
		long usuarioid = Long.parseLong(request.getParameter("usuarioid"));
		Usuario delusuario = dao.findById(Usuario.class, usuarioid).get();
		
		dao.delete(delusuario);
		response.sendRedirect("formLoginUsuario.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		UsuarioDao dao = new UsuarioDao();
		
		if(request.getParameter("cursoid")==null)
		{
			
			Usuario novoUsuario = new Usuario();
			novoUsuario.setNome(request.getParameter("nome"));
			novoUsuario.setLogin(request.getParameter("login"));
			novoUsuario.setSenha(request.getParameter("senha"));
			
			
			dao.save(novoUsuario);
		
		}else {
			long usuarioid = Long.parseLong(request.getParameter("usuarioid"));
			Usuario usuario = dao.findById(Usuario.class, usuarioid).get();
			
			
			usuario.setNome(request.getParameter("nome"));
			usuario.setLogin(request.getParameter("login"));
			usuario.setSenha(request.getParameter("senha"));
			
			dao.update(usuario);
			
		}
		response.sendRedirect("formLoginUsuario.jsp");
	}
}
