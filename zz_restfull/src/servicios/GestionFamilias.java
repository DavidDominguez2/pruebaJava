package servicios;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.beans.Familia;
import model.beans.Producto;
import model.daos.FamiliaDaoImpl;
import model.daos.ProductoDaoImpl;

@Path("/familia")
public class GestionFamilias {
	private FamiliaDaoImpl fdao;
	
	public GestionFamilias(){
		fdao = new FamiliaDaoImpl();
		
	}
	
	@GET
	@Path("/leer/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Producto leerProducto(@PathParam("id") int idProducto) {
		ProductoDaoImpl pdao = new ProductoDaoImpl();
		Producto producto = pdao.findById(idProducto);
	 	 
		return producto;
	}
	
	@GET
	@Path("/porfam/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Producto> leerProductoFamilia(@PathParam("id") int idFamilia) {
		ProductoDaoImpl pdao = new ProductoDaoImpl();
		return pdao.findByFamilia(idFamilia);
	}
	
	@POST
	@Path("/alta")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String altaFamilia(Familia familia) {
		int filas = fdao.altaFamilia(familia);
		if (filas == 1)
			return "familia insertada";
		else
			return "familia NOOO insertada";
		
	}
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String modificarFamilia(Familia familia) {
		int filas = fdao.updateFamilia(familia);
		if (filas == 1)
			return "familia modificada";
		else
			return "familia NOOO modificada";
		
	}
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String borraFamilia(@PathParam("id") int idFamilia) {
		int filas = fdao.deleteFamilia(idFamilia);
		if (filas == 1)
			return "familia borrada";
		else
			return "familia NOOO borrada";
		
	}
	

}
