package com.utng.asociasociones1;

import java.util.List;

public class Articulo {
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidadminima;
	
	private List<Rubro> rubros;
	
	public Articulo(List<Rubro> rubros) {
		this.rubros = rubros;

}

}
