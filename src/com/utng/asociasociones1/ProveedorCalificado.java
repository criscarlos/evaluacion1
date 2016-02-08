package com.utng.asociasociones1;

import java.sql.Date;
import java.util.List;

public class ProveedorCalificado {
	private Date FechaCalificacion; 
 	private int cal_ID; 
 	private int pr_ID;
 	
 		private List<Calificacion> calificacions;
 	
 	public void ProveerdorCalificado(List<Calificacion> calificacions) {
 		this.calificacions = calificacions;
 	
 	}

}
