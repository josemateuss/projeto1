package mateus.projeto1;

//import org.apache.catalina.core.ApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import mateus.projeto1.component.VehicleComponent;

@SpringBootApplication
public class Projeto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);		
		
//		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(Projeto1Application.class, args);
//	
//		VehicleComponent component = (VehicleComponent) ((BeanFactory) ctx).getBean("vehicleComponent");
//		
//		component.service();
	}

}
