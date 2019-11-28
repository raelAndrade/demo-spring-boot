package br.com.example.demo.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParentResource {
	
	@GetMapping("/pais")
	public String form() {
		return "registration/parents/form";
	}
	
	@GetMapping("/pais/listar")
	public ModelAndView listAll() {
		ModelAndView mv = new ModelAndView("registration/parents/list");
		return mv;
	}

}
