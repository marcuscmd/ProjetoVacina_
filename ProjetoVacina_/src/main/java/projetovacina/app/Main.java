package projetovacina.app;

import javax.persistence.EntityManager;

import projetovacina.util.JpaUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	}
}
