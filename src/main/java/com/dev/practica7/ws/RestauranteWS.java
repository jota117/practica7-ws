package com.dev.practica7.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dev.practica7.entitys.Restaurante;
import com.dev.practica7.services.RestauranteService;

@Path("restauranteWS")
public class RestauranteWS {

private RestauranteService restService = new RestauranteService();
	
	@Path("test")
	@GET
	public String test() {
		
		return "Probando webservice con Jersey";
	}
	
	
	@GET
	@Path("consultarRestaurantes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Restaurante> consultarRestaurantes(){
		
		return this.restService.consultarRestaurantes();
	}
	
	@POST
	@Path("guardarRestaurante")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response guardarRestaurante(Restaurante rest){
		
		if (rest == null) {		
			return Response.status(400).entity("No se ingreso informacion del Restaurante, favor de capturar sus datos").build();	
		}
		
		if (rest.getIdRestaurante() == null || rest.getIdRestaurante().equals(0)) {	
			return Response.status(400).entity("El ID de Restaurante es requerido").build();
		}
		
		if(rest.getNombre() == null || rest.getNombre().isEmpty()) {			
			return Response.status(400).entity("El nombre es requerido").build();
		}
		
		GenericEntity<Restaurante> restGeneric = new GenericEntity<Restaurante>(rest, Restaurante.class);
		
		
		return Response.ok(restGeneric).build();
	}
	
	
}
