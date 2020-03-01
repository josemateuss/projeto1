package mateus.projeto1.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mateus.projeto1.entity.Car;

@RestController
public class CarController {
	
	@RequestMapping(value= "car/{name}", method = RequestMethod.GET)
	public List<Car> getCars(@PathVariable String name){
		
		List<Car> cars = new ArrayList<>();
		
		Car car = new Car("Monza", "Vermelho");
		Car car2 = new Car(name, "Preto");
		
		cars.add(car);
		cars.add(car2);
		
		return cars;
		
	}
	
	@RequestMapping(value= "car", method = RequestMethod.POST)
	public Car setCar(@RequestBody Car car) {
		
		return car;
	}

}
