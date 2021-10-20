package com.practica.starter3.model;

public class Recurso {
	
	private String nombre;
	private Integer valor;
	private String validez;
	
	public Recurso(String nombre, Integer valor, String validez) {
		this.nombre = nombre;
		this.valor = valor;
		this.validez = validez;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public String getValidez() {
		return validez;
	}

	public void setValidez(String validez) {
		this.validez = validez;
	}

	public String mostrarRecurso() {
		String recurso = "";
		if (validez.equals("Valido")) {
			recurso = "El recurso es valido";
//			recurso = "El recurso es valido": "+nombre+" tiene valor: "+valor.toString();
		}else if (validez == "Mantenimiento") {
			recurso = "El recurso: "+nombre+" se encuentra bajo mantenimiento";
		}else if (validez == "Deshabilitado") {
			recurso = "El recurso: "+nombre+" está Deshabilitado temporalmente";
		}else {
			recurso = "Algo falla0";
		}
		return recurso;
	}

}
