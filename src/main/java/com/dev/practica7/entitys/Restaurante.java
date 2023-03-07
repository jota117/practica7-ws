/**
 * 
 */
package com.dev.practica7.entitys;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;


public class Restaurante {

	@Getter @Setter
	private Long idRestaurante;
	@Getter @Setter
	private String nombre;
	@Getter @Setter
	private String direccion;
	@Getter @Setter
	private String slogan;
	
}
