package projetovacina.dao;

import javax.persistence.Query;

import projetovacina.models.FornecedorVacina;

public class FornecedorVacinaDao extends Dao<FornecedorVacina, Long>{
	
	public FornecedorVacina getFornecedorVacina(Long idVacina) {
		FornecedorVacina employee;
		try {
			Query query = em.createNativeQuery("SELECT * FROM fornecedorvacina u WHERE u.vacinas_id =:idVacina", FornecedorVacina.class);
			
			query.setParameter("idVacina", idVacina);
			
			employee = (FornecedorVacina)query.getSingleResult();
		}catch (Exception x) {
			employee = null;
		}
		return employee;
	}
}
