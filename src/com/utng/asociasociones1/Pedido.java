package com.utng.asociasociones1;

import java.sql.Date;
import java.util.List;

public class Pedido {
	private double pe_id; 
 	private Date pe_fechapedido; 
 	private Date pe_fechanecesidad; 
 	private Date pe_fechaprogramada; 
 	private Date pe_fechaentrega; 
 	private int pe_estado; 
 	
 	private List<Articulo> articulo;
 	
 	public Pedido(List<Articulo> articulo) {
		this.articulo = articulo;
 	}

}
