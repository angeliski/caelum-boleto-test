package br.com.angeliski.caelumboletotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CaelumBoletoTestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CaelumBoletoTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CaelumBoletoTestApplication.class, args);
	}
}
