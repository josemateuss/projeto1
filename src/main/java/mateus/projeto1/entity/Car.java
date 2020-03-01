package mateus.projeto1.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mateus.projeto1.repository.Vehicle;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Iniciar carro");
	}

	@Override
	public void stop() {
		System.out.println("Parar carro");
	}

}
