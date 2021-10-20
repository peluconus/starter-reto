package com.practica.starter3.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practica.starter3.model.Recurso;

@Configuration
@ConditionalOnClass(Recurso.class)
@EnableConfigurationProperties(RecursoProperties.class)
public class RecursoAutoconfigure {
	
	private final RecursoProperties properties;
	
	public RecursoAutoconfigure(RecursoProperties properties) {
		this.properties = properties;
	}

	@Bean
	public Recurso mostrar() {
		return new Recurso("Recurso inicial", 0, properties.getValidez());
	}
}
