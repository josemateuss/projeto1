package mateus.projeto1.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		
		System.out.println("Método hello com Spring Context");
		
		return "return";
	}

}