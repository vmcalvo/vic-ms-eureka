package com.everis.vcalvoma;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServidorRegistro {

	protected static Logger logger = Logger.getLogger(ServidorRegistro.class.getName());

	public static void main(String[] args) {

		SpringApplication.run(ServidorRegistro.class, args);
	}

}
