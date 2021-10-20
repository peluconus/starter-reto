package com.practica.starter3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("recurso.estado")
public class RecursoProperties {
	
	private String validez = "Valido";

	public String getValidez() {
		return validez;
	}

	public void setValidez(String validez) {
		this.validez = validez;
	}
	

}
