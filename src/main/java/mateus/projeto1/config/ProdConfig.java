package mateus.projeto1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {
	
	@Bean
	public ProdConfig prodConfig() {
		return new ProdConfig();
	}

}
