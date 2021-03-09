package model.daos;

import java.util.List;

import javax.persistence.TypedQuery;

import model.beans.Familia;

public class FamiliaDaoImpl extends AbstractFamiliaDao implements IntFamiliaDao{
	
	
	public FamiliaDaoImpl() {
		super();
	}

	@Override
	public int altaFamilia(Familia familia) {
		int filas = 0;
		try {
			tx.begin();
			em.persist(familia);
			tx.commit();
			filas = 1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int deleteFamilia(Familia familia) {
		int filas = 0;
		Familia otraFamilia = findById(familia.getCodigo());
		try {
			tx.begin();
			em.remove(otraFamilia);
			tx.commit();
			filas = 1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public int updateFamilia(Familia familia) {
		int filas = 0;
		try {
			tx.begin();
			em.merge(familia);
			tx.commit();
			filas = 1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Familia findById(int idFamilia) {
		// TODO Auto-generated method stub
		return em.find(Familia.class, idFamilia);
	}

	@Override
	public List<Familia> findAll() {
		sql = "select f from Familia f";
		query = em.createQuery(sql);
		return query.getResultList();
		
	}

	@Override
	public int deleteFamilia(int idFamilia) {
		int filas = 0;
		Familia otraFamilia = findById(idFamilia);
		try {
			tx.begin();
			em.remove(otraFamilia);
			tx.commit();
			filas = 1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

}
