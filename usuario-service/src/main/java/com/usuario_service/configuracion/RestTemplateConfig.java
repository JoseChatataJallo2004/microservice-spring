package com.usuario_service.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	//Hemos registrado rest template para poder comunicarnos con otros microservicios
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
