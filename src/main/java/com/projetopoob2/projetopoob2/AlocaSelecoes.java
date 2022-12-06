package com.projetopoob2.projetopoob2;

import com.projetopoob2.modelo.*;

import java.util.LinkedList;

public class AlocaSelecoes {
	protected static Selecao equador() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alexander Domínguez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Hernán Galíndez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Moisés Ramírez"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Piero Hincapié"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Félix Torres"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Robert Arboleda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Xavier Arreaga"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Jackson Porozo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Angelo Preciado"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Pervis Estupiñán"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "William Pacho"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Diego Palacios"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Moisés Caicedo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Carlos Gruezo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jhegson Méndez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Alan Franco"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "José Cifuentes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ángel Mena"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Gonzalo Plata"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jeremy Sarmiento"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Romario Ibarra"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ayrton Preciado"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Énner Valencia"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Michael Estrada"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Djorkaeff Reasco"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kevin Rodríguez"));


		return new Selecao("Equador",new Pessoa(Tipo_Pessoa.TREINADOR, "Gustavo Julio Alfaro"), jogadores);
	}

	protected static Selecao holanda() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Justin Bijlow"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Remko Pasveer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Andries Noppert"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Virgil van Dijk"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Nathan Ake"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Daley Blind"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Jurrien Timber"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Denzel Dumfries"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Stefan de Vrij"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Mathijs de Ligt"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Tyrell Malacia"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Jeremie Frimpong"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Frenkie e Jong"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Steven Berghuis"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Davy Klaassen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Teun Koopmeiners"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Cody Gakpo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Marta de Roon"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kenneth Taylor"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Xavi Simons"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Memphis Depay"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Steven Bergwijn"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Vincent Janssen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Lucas de Jong"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Noa Lang"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Wout Weghorst"));

		return new Selecao("Holanda",new Pessoa(Tipo_Pessoa.TREINADOR, "Louis Van Gaal"), jogadores);
	}

	protected static Selecao catar() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Saad Al Sheeb"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Meshal Barsham"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Yousef Hassan"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Pedro Miguel"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Musab Kheder"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Bassam Al-Rawi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Boualem Khoukhi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Abdelkarim Hassan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Tarek Salman"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Homam Ahmed"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Jassem Gaber"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mohammed Waad"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Abdulaziz Hatem"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ali Assadalla"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Salem Al-Hajri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Karim Boudiaf"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Assim Madibo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mostafa Meshaal"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Akram Afif"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ahmed Alaaeldin"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mohammed Muntari"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Hassan Al-Haydos"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ismaeel Mohammad"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Khalid Muneer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Almoez Ali"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Naif Al-Hadhrami"));

		return new Selecao("Catar",new Pessoa(Tipo_Pessoa.TREINADOR, "Félix Sánchez"), jogadores);
	}

	protected static Selecao senegal() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Seny Dieng"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alfred Gomis"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Edoaurd Mendy"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Pape Abdou Cissé"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Abdou Diallo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Ismail Jakobs"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Kalidou Koulibaly"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Formose Mendy"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Youssouf Sabaly"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ZAGUEIRO, "Fodé Balo Touré"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pathé Ciss"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Krepin Diatta"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Idrissa Gana Gueye"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pape Gueye"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Cheikhou Kouyate"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mamadou Loum"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Nampalys Mendy"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Moustapha Name"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pape Matar"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Boulaye Dia"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Bamba Dieng"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Nicolas Jackson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Sadio Mané"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Iliman Ndiaye"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ismaila Sarr"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Famara Diedhiou"));

		return new Selecao("Senegal",new Pessoa(Tipo_Pessoa.TREINADOR, "Félix Sánchez"), jogadores);
	}
}
