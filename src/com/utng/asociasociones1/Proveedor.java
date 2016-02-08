package com.utng.asociasociones1;

import java.util.List;

public class Proveedor {
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private Short pr_telefono2;
	private Short pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;
	
	private List<Rubro>rubros; 
 	private List<Direccion> direccion; 
 	
 	public Proveedor(List<Rubro>rubros,List<Direccion> 
 	direccion,Calificacion caificacion, Articulo articulo) { 
 		this.rubros = rubros; 
 		this.direccion = direccion; 
 	}

}
