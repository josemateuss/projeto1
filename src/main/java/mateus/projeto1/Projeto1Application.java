package mateus.projeto1;

//import org.apache.catalina.core.ApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//import mateus.projeto1.component.VehicleComponent;

@SpringBootApplication
//@ComponentScan(basePackages = {"mateus.projeto1.service","mateus.projeto1.controllers"})
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

/* 
Annotations:
@Component --> Indica que a classe é um componente e será criado como se fosse um Bean.
@Controller --> Indica que a classe tem um papel no Spring MVC como a controladora.
@RestController --> É uma classe que herda da anootation @Controller e ainda add @ReponseBody.
@Repository --> Mecanismos de encapsulamento de armazenamento de espaço, o que vai ter no banco.
@Service --> É uma classe que pode ser utilizada para não sobrecarregar a controladora
			 É na @Service é onde podem ficar as regras de negócio.
*/