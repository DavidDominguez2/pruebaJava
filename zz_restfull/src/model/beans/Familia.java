package model.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the familias database table.
 * 
 */
@Entity
@Table(name="familias")
@NamedQuery(name="Familia.findAll", query="SELECT f FROM Familia f")
public class Familia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String descripcion;
/*
	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="familia")
	private List<Producto> productos;
*/
	public Familia() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
/*
	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setFamilia(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setFamilia(null);

		return producto;
	}
*/
}