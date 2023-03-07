/**
 * 
 */
package com.dev.practica7.services;

import java.util.ArrayList;
import java.util.List;

import com.dev.practica7.entitys.Restaurante;


public class RestauranteService {

	public List<Restaurante> consultarRestaurantes(){
		
		List<Restaurante> restaurants = new ArrayList();
		
		Restaurante rest = new Restaurante();
		rest.setIdRestaurante(123456L);
		rest.setNombre("McDonalds");
		rest.setSlogan("M"); 
		rest.setDireccion("Calle dos #1 ");
		
		Restaurante rest1 = new Restaurante();
		rest1.setIdRestaurante(123457L);
		rest1.setNombre("vidArgentina");
		rest1.setSlogan("Slogan2"); 
		rest1.setDireccion("Calle tres #2 ");
		
		Restaurante rest2 = new Restaurante();
		rest2.setIdRestaurante(123458L);
		rest2.setNombre("Entrefuegos");
		rest2.setSlogan("Slogan3"); 
		rest2.setDireccion("Calle cuatro #3 ");
		
		restaurants.add(rest);
		restaurants.add(rest1);
		restaurants.add(rest2);
		
		
		return restaurants;
		
	}
}
