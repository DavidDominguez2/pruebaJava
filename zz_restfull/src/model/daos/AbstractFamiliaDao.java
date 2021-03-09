package model.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AbstractFamiliaDao {
	
	protected EntityManagerFactory emf;
	protected EntityManager em;
	protected EntityTransaction tx;
	protected Query query;
	protected String sql;
	
	public AbstractFamiliaDao() {
		emf = Persistence.createEntityManagerFactory("zz_restfull");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		
	}
	
	

}
