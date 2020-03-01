package mateus.projeto1.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MinhaApplicationPropertie implements ApplicationListener<ContextRefreshedEvent>{

	@Value("${minha.application}")
	private String minhaApplicationProp;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(minhaApplicationProp);
	}
	
	
}
