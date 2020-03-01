package mateus.projeto1.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import mateus.projeto1.repository.Vehicle;

public class VehicleComponent {

	@Autowired
	@Qualifier("carBean")
	private Vehicle vehicle;
	
	public void service() {
		vehicle.start();
		vehicle.stop();
	}
	
}
