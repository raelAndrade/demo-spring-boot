package br.com.example.demo.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeResource {

	@GetMapping("/")
	public String index() {
		return "/home/index";
	}
}
