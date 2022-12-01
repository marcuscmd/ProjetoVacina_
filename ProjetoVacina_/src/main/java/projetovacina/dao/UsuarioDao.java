package projetovacina.dao;

import javax.persistence.Query;
import projetovacina.models.Usuario;

public class UsuarioDao extends Dao<Usuario, Long>{

	public Usuario login(String user, String senha) {
		Usuario employee;
		try {
			Query query = em.createNativeQuery("SELECT * FROM usuario u WHERE u.login =:user AND u.senha =:senha", Usuario.class);
			
			query.setParameter("user", user);
			query.setParameter("senha", senha);
			
			employee = (Usuario)query.getSingleResult();
		}catch (Exception x) {
			employee = null;
		}
		return employee;
	}
}
