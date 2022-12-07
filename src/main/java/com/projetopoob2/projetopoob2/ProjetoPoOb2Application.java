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
	private final LinkedList<Selecao> selecoesGrupoA;
	private final LinkedList<Selecao> selecoesGrupoB;
	private final LinkedList<Selecao> selecoesGrupoC;
	private final LinkedList<Selecao> selecoesGrupoD;
	private final LinkedList<Selecao> selecoesGrupoE;
	private final LinkedList<Selecao> selecoesGrupoF;
	private final LinkedList<Selecao> selecoesGrupoG;
	private final LinkedList<Selecao> selecoesGrupoH;
	private final String nomeProfessor;

	public ProjetoPoOb2Application() {
		this.selecoesGrupoA = new LinkedList<Selecao>();
		this.selecoesGrupoB = new LinkedList<Selecao>();
		this.selecoesGrupoC = new LinkedList<Selecao>();
		this.selecoesGrupoD = new LinkedList<Selecao>();
		this.selecoesGrupoE = new LinkedList<Selecao>();
		this.selecoesGrupoF = new LinkedList<Selecao>();
		this.selecoesGrupoG = new LinkedList<Selecao>();
		this.selecoesGrupoH = new LinkedList<Selecao>();

		this.selecoesGrupoA.add(AlocaSelecoes.catar());
		this.selecoesGrupoA.add(AlocaSelecoes.equador());
		this.selecoesGrupoA.add(AlocaSelecoes.holanda());
		this.selecoesGrupoA.add(AlocaSelecoes.senegal());

		this.selecoesGrupoB.add(AlocaSelecoes.inglaterra());
		this.selecoesGrupoB.add(AlocaSelecoes.ira());
		this.selecoesGrupoB.add(AlocaSelecoes.eua());
		this.selecoesGrupoB.add(AlocaSelecoes.gales());

		this.selecoesGrupoC.add(AlocaSelecoes.argentina());
		this.selecoesGrupoC.add(AlocaSelecoes.mexico());
		this.selecoesGrupoC.add(AlocaSelecoes.polonia());
		this.selecoesGrupoC.add(AlocaSelecoes.arabiaSaudita());

		this.selecoesGrupoD.add(AlocaSelecoes.australia());
		this.selecoesGrupoD.add(AlocaSelecoes.dinamarca());
		this.selecoesGrupoD.add(AlocaSelecoes.franca());
		this.selecoesGrupoD.add(AlocaSelecoes.tunisia());

		this.selecoesGrupoE.add(AlocaSelecoes.costaRica());
		this.selecoesGrupoE.add(AlocaSelecoes.alemanha());
		this.selecoesGrupoE.add(AlocaSelecoes.japao());
		this.selecoesGrupoE.add(AlocaSelecoes.espanha());

		this.selecoesGrupoF.add(AlocaSelecoes.belgica());
		this.selecoesGrupoF.add(AlocaSelecoes.canada());
		this.selecoesGrupoF.add(AlocaSelecoes.croacia());
		this.selecoesGrupoF.add(AlocaSelecoes.marrocos());

		this.selecoesGrupoG.add(AlocaSelecoes.brasil());
		this.selecoesGrupoG.add(AlocaSelecoes.camaroes());
		this.selecoesGrupoG.add(AlocaSelecoes.servia());
		this.selecoesGrupoG.add(AlocaSelecoes.suica());

		this.selecoesGrupoH.add(AlocaSelecoes.gana());
		this.selecoesGrupoH.add(AlocaSelecoes.portugal());
		this.selecoesGrupoH.add(AlocaSelecoes.coreia());
		this.selecoesGrupoH.add(AlocaSelecoes.uruguai());

		this.nomeProfessor = "Otávio Lube dos Santos";
	}

	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("catar", this.selecoesGrupoA.get(0));
		model.addAttribute("equador", this.selecoesGrupoA.get(1));
		model.addAttribute("holanda", this.selecoesGrupoA.get(2));
		model.addAttribute("senegal", this.selecoesGrupoA.get(3));

		model.addAttribute("inglaterra", this.selecoesGrupoB.get(0));
		model.addAttribute("ira", this.selecoesGrupoB.get(1));
		model.addAttribute("eua", this.selecoesGrupoB.get(2));
		model.addAttribute("gales", this.selecoesGrupoB.get(3));

		model.addAttribute("argentina", this.selecoesGrupoC.get(0));
		model.addAttribute("mexico", this.selecoesGrupoC.get(1));
		model.addAttribute("polonia", this.selecoesGrupoC.get(2));
		model.addAttribute("arabiaSaudita", this.selecoesGrupoC.get(3));

		model.addAttribute("australia", this.selecoesGrupoD.get(0));
		model.addAttribute("dinamarca", this.selecoesGrupoD.get(1));
		model.addAttribute("franca", this.selecoesGrupoD.get(2));
		model.addAttribute("tunisia", this.selecoesGrupoD.get(3));

		model.addAttribute("costaRica", this.selecoesGrupoE.get(0));
		model.addAttribute("alemanha", this.selecoesGrupoE.get(1));
		model.addAttribute("japao", this.selecoesGrupoE.get(2));
		model.addAttribute("espanha", this.selecoesGrupoE.get(3));

		model.addAttribute("belgica", this.selecoesGrupoF.get(0));
		model.addAttribute("canada", this.selecoesGrupoF.get(1));
		model.addAttribute("croacia", this.selecoesGrupoF.get(2));
		model.addAttribute("marrocos", this.selecoesGrupoF.get(3));

		model.addAttribute("brasil", this.selecoesGrupoG.get(0));
		model.addAttribute("camaroes", this.selecoesGrupoG.get(1));
		model.addAttribute("servia", this.selecoesGrupoG.get(2));
		model.addAttribute("suica", this.selecoesGrupoG.get(3));

		model.addAttribute("gana", this.selecoesGrupoH.get(0));
		model.addAttribute("portugal", this.selecoesGrupoH.get(1));
		model.addAttribute("coreia", this.selecoesGrupoH.get(2));
		model.addAttribute("uruguai", this.selecoesGrupoH.get(3));

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
