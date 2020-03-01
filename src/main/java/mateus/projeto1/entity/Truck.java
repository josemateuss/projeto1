package mateus.projeto1.entity;

/*import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mateus.projeto1.repository.Vehicle;*/

/*@Component
@Qualifier("truckBean")*/
public class Truck /*implements Vehicle*/ {

	/*@Override
	public void start() {
		System.out.println("Inicar Caminhão");
	}

	@Override
	public void stop() {
		System.out.println("Parar caminhão");
	}*/
	
	private String name;
	private String color;
	
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
