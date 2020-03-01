package mateus.projeto1.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mateus.projeto1.repository.Vehicle;

@Component
@Qualifier("truckBean")
public class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("Inicar Caminhão");
	}

	@Override
	public void stop() {
		System.out.println("Parar caminhão");
	}

}
