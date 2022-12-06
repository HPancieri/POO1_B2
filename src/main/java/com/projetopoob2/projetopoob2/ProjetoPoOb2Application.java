package com.projetopoob2.projetopoob2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.projetopoob2.modelo.*;

import java.util.LinkedList;

@SpringBootApplication
@Controller
public class ProjetoPoOb2Application {
	private final LinkedList<Selecao> selecoes;
	private final String nomeProfessor;

	public ProjetoPoOb2Application() {
		this.selecoes = new LinkedList<Selecao>();

		selecoes.add(AlocaSelecoes.catar());
		selecoes.add(AlocaSelecoes.equador());
		selecoes.add(AlocaSelecoes.holanda());
		selecoes.add(AlocaSelecoes.senegal());

		nomeProfessor = "Otávio Lube dos Santos";
	}

	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("catar", this.selecoes.get(0));
		model.addAttribute("equador", this.selecoes.get(1));
		model.addAttribute("holanda", this.selecoes.get(2));
		model.addAttribute("senegal", this.selecoes.get(3));

		model.addAttribute("nomeProfessor", this.nomeProfessor);

		return "index";
	}

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
