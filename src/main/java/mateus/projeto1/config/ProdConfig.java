package mateus.projeto1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdConfig {
	
	@Bean
	public ProdConfig prodConfig() {
		return new ProdConfig();
	}

}
