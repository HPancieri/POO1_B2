package com.projetopoob2.projetopoob2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ProjetoPoOb2Application {

	@GetMapping(value = "/")
	public String index() { return "index"; }

	@GetMapping(value = "/forgot-password")
	public String fpassword() { return "forgot-password"; }

	@GetMapping(value = "/login")
	public String login() { return "login"; }

	@GetMapping(value = "/register")
	public String register() { return "register"; }

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPoOb2Application.class, args);
	}

}
