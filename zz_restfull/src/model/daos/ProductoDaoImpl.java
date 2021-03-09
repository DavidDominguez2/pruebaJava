package model.daos;

import java.util.List;

import model.beans.Producto;

public class ProductoDaoImpl extends AbstractFamiliaDao implements IntProductoDao{
	
	public ProductoDaoImpl() {
		super();
	}

	@Override
	public Producto findById(int idProducto) {
		// TODO Auto-generated method stub
		return em.find(Producto.class, idProducto);
	}

	@Override
	public int alta(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Producto> findByFamilia(int idFamilia) {
		sql = "select p from Producto p where p.familia.codigo = :cod";
		query = em.createQuery(sql);
		query.setParameter("cod", idFamilia);
		return query.getResultList();
 
	}
	
	

}
