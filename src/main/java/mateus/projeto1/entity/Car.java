package mateus.projeto1.entity;

/*import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mateus.projeto1.repository.Vehicle;*/

/*@Component
@Qualifier("carBean")*/
public class Car /*implements Vehicle*/ {

	/*@Override
	public void start() {
		System.out.println("Iniciar carro");
	}

	@Override
	public void stop() {
		System.out.println("Parar carro");
	}*/
	
	private String name;
	private String color;
	
	public Car() {
		
	}
	
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
