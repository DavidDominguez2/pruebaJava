package model.daos;

import java.util.List;

import model.beans.Producto;

public interface IntProductoDao {
	
	Producto findById(int idProducto);
	int alta(Producto producto);
	List<Producto> findByFamilia(int idFamilia);

}
