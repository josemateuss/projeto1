package mateus.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import mateus.projeto1.entity.Truck;

@Controller
public class TruckController {

	@GetMapping("/truck")
	public String getTruck(Model model) {
		
		model.addAttribute("truck", new Truck());
		
		return "truck";
	}
	
	@PostMapping("/truck")
	public String truckSubmit(@ModelAttribute Truck truck) {
		
		return "result";
	}

}
