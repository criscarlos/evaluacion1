package com.utng.asociasociones2;

import java.util.List;

public class Orden {
	private int hora; 
 	private String mesero;
 	
 	
 	private Cliente cliente; 
 	private Pago pago;
 	
 	private List<Bebida> bebidas; 
 	private List<Platillo>platillos;
 	
 	public Orden(List<Bebida> bebidas, List<Platillo>platillos) { 
 		this.bebidas = bebidas; 
 		this.platillos = platillos; 
 	} 

}
