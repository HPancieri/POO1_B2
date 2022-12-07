package com.projetopoob2.projetopoob2;

import com.projetopoob2.modelo.*;

import java.util.LinkedList;

public class AlocaSelecoes {
	// Grupo A
	protected static Selecao equador() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alexander Domínguez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Hernán Galíndez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Moisés Ramírez"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Piero Hincapié"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Félix Torres"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Robert Arboleda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Xavier Arreaga"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jackson Porozo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Angelo Preciado"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Pervis Estupiñán"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "William Pacho"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Diego Palacios"));

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

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Virgil van Dijk"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nathan Ake"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Daley Blind"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jurrien Timber"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Denzel Dumfries"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Stefan de Vrij"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Mathijs de Ligt"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Tyrell Malacia"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jeremie Frimpong"));

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

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Pedro Miguel"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Musab Kheder"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Bassam Al-Rawi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Boualem Khoukhi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Abdelkarim Hassan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Tarek Salman"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Homam Ahmed"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jassem Gaber"));

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

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Pape Abdou Cissé"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Abdou Diallo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ismail Jakobs"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kalidou Koulibaly"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Formose Mendy"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Youssouf Sabaly"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Fodé Balo Touré"));

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

	// Grupo B

	protected static Selecao inglaterra() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Jordan Pickford"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Nick Pope"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Aaron Ramsdale"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Trent Alexander-Arnold"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Conor Coady"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Eric Dier"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Harry Maguire"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Luke Shaw"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "John Stones"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kieran Trippier"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kyle Walker"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ben White"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jude Bellingham"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Conor Gallagher"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jordan Henderson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mason Mount"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kalvin Phillips"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Declan Rice"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Phil Foden"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jack Grealish"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Harry Kane"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "James Maddison"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Marcus Rashford"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Bukayo Saka"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Raheem Sterling"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Callum Wilson"));

		return new Selecao("Inglaterra",new Pessoa(Tipo_Pessoa.TREINADOR, "Gareth Southgate"), jogadores);
	}

	protected static Selecao ira() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alireza Beiranvand"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Amir Abedzadeh"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Hossein Hosseini"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Payam Niazmand"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ehsan Hajsafi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Morteza Pouraliganji"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ramin Rezaeian"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Milad Mohammadi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Hossein Kanaanizadegan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Shojae Khalilzadeh"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Sadegh Moharrami"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Rouzbeh Cheshmi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Majid Hosseini"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Abolfazl Jalali"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Vahid Amiri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Alireza Jahanbakhsh"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Saeid Ezatolahi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mehdi Torabi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Saman Ghoddos"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ali Gholizadeh"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ahmad Nourollahi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ali Karimi"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Karim Ansarifard"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Sardar Azmoun"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mehdi Taremi"));

		return new Selecao("Irã",new Pessoa(Tipo_Pessoa.TREINADOR, "Carlos Queiroz"), jogadores);
	}

	protected static Selecao eua() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Ethan Horvath"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Sean Johnson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Matt Turner"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Cameron Carter-Vickers"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Sergiño Dest"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Aaron Long"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Shaq Moore"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Tim Ream"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Antonee Robinson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joe Scally"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "DeAndre Yedlin"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Walker Zimmerman"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Brenden Aaronson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kellyn Acosta"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Tyler Adams"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Luca de la Torre"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Weston McKennie"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Yunus Musah"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Cristian Roldan"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jesús Ferreira"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jordan Morris"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Christian Pulisic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Gio Reyna"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Josh Sargent"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Tim Weah"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Haji Wright"));

		return new Selecao("Estados Unidos",new Pessoa(Tipo_Pessoa.TREINADOR, "Gregg Berhalter"), jogadores);
	}

	protected static Selecao gales() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Wayne Hennessey"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Danny Ward"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Adam Davies"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Chris Gunter"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ben Davies"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Connor Roberts"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ethan Ampadu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Chris Mepham"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joe Rodon"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Neco Williams"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Tom Lockyer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ben Cabango"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Aaron Ramsey"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Joe Allen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Harry Wilson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jonny Williams"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Joe Morrell"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Matthew Smith"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Dylan Levitt"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Rubin Colwill"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sorba Thomas"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Gareth Bale"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Daniel James"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kieffer Moore"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Brennan Johnson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mark Harris"));

		return new Selecao("País de Gales",new Pessoa(Tipo_Pessoa.TREINADOR, "Rob Page"), jogadores);
	}

	// Grupo C
	protected static Selecao argentina() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Franco Armani"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Emiliano Martínez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Gerónimo Rulli"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Marcos Acuña"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Juan Foyth"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nahuel Molina"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Gonzalo Montiel"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nicolás Otamendi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Germán Pezzella"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Cristian Romero"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nicolás Tagliafico"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ángel Di María"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Rodrigo De Paul"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Enzo Fernández"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Alexis MacAllister"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Exequiel Palacios"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Leandro Paredes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Guido Rodríguez"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Julián Álvarez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Paulo Dybala"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Joaquín Correa"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Alejandro Gómez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Nicolás González"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Lautaro Martínez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Lionel Messi"));

		return new Selecao("Argentina",new Pessoa(Tipo_Pessoa.TREINADOR, "Lionel Scaloni"), jogadores);
	}

	protected static Selecao mexico() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Guillermo Ochoa"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Rodolfo Cota"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alfredo Talavera"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jorge Sánchez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kevin Álvarez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Néstor Araujo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Johan Vásquez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Gerardo Arteaga"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Héctor Moreno"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "César Montes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jesús Gallardo"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Andrés Guardado"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Héctor Herrera"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Carlos Rodríguez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Érick Gutiérrez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Luis Chávez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Édson Álvarez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Luis Romo"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Orbelín Pineda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Hirving Lozano"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Raúl Jiménez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Uriel Antuna"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Henry Martín"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Rogelio Funes Mori"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Alexis Vega"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Roberto Alvarado"));

		return new Selecao("México",new Pessoa(Tipo_Pessoa.TREINADOR, "Gerardo Martino"), jogadores);
	}

	protected static Selecao polonia() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Bart Dragowski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Lukasz Skorupski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Wojciech Szczesny"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jan Bednarek"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Bartosz Bereszynski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Matty Cash"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kamil Glik"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Robert Gumny"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Artur Jedrzejczyk"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jakub Kiwior"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Mateusz Wieteska"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Szymon Zalewski"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Krystian Bielik"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Przemyslaw Frankowski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kamil Grosicki"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Grzegorz Krychowiak"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Michal Skoras"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Damian Szymanski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sebastian Szymanski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Piotr Zielinski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Szymon Zurkowski"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Robert Lewandowski"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Arkadius Milik"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Krzysztof Piatek"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Karol Swiderski"));

		return new Selecao("Polônia",new Pessoa(Tipo_Pessoa.TREINADOR, "Czesław Michniewicz"), jogadores);
	}
	protected static Selecao arabiaSaudita() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Mohamed Al-Owais"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Nawaf Al-Aqidi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Mohamed Al-Yami"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Yasser Al-Shahrani"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ali Al-Bulaihi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Abdulelah Al-Amri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Abdullah Madu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Hassan Tambakti"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Sultan Al-Ghanam"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Mohammed Al-Breik"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Saud Abdulhamid"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Salman Al-Faraj"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Riyadh Sharahili"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ali Al-Hassan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mohamed Kanno"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Abdulelah Al-Malki"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sami Al-Najei"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Abdullah Otayf"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Nasser Al-Dawsari"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Abdulrahman Al-Aboud"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Salem Al-Dawsari"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Hattan Bahebri"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Fahad Al-Muwallad"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Haitham Asiri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Saleh Al-Shehri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Firas Al-Buraikan"));

		return new Selecao("Arábia Saudita",new Pessoa(Tipo_Pessoa.TREINADOR, "Hervé Renard"), jogadores);
	}

	// Grupo D
	protected static Selecao australia() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Mathew Ryan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Danny Vukovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Andrew Redmayne"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Aziz Behich"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Miloš Degenek"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Bailey Wright"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Fran Karačić"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Harry Souttar"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nathaniel Atkinson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joel King"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kye Rowles"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Thomas Deng"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Aaron Mooy"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jackson Irvine"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ajdin Hrustic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Riley McGree"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Keanu Baccus"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Cameron Devlin"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mathew Leckie"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Awer Mabil"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jamie Maclaren"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mitchell Duke"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Martin Boyle"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Craig Goodwin"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jason Cummings"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Garang Kuol"));

		return new Selecao("Austrália", new Pessoa(Tipo_Pessoa.TREINADOR, "Graham Arnold"), jogadores);
	}
	protected static Selecao dinamarca() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Kasper Schmeichel"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Oliver Christensen"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Simon Kjaer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joachim Andersen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joakim Maehle"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Andreas Christensen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Rasmus Kristensen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jens Stryger Larsen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Victor Nelsson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Daniel Wass"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Thomas Delaney"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mathias Jensen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Christian Eriksen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pierre-Emile Hojbjerg"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Andreas Skov Olsen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jesper Lindstrom"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Andreas Cornelius"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Martin Braithwaite"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kasper Dolberg"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mikkel Damsgaard"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jonas Wind"));

		return new Selecao("Dinamarca", new Pessoa(Tipo_Pessoa.TREINADOR, "Kasper Hjulmand"), jogadores);
	}

	protected static Selecao franca() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Hugo Lloris"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alphonse Areola"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Steve Mandanda"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Benjamin Pavard"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jules Koundé"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Presnel Kimpembe"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "William Saliba"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Raphael Varane"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Lucas Hernández"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Théo Hernández"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ibrahima Konaté"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Dayot Upamecano"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Adrien Rabiot"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Aurélien Tchouaméni"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Youssouf Fofana"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mattéo Guendouzi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jordan Varetout"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Eduardo Camavinga"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kingsley Coman"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kylian Mbappé"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Karim Benzema"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Antoine Griezmann"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ousmane Dembélé"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Randal Kolo Muani"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Oliver Giroud"));

		return new Selecao("França", new Pessoa(Tipo_Pessoa.TREINADOR, "Didier Deschamps"), jogadores);
	}

	protected static Selecao tunisia() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Aymen Dahmen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Mouez Hassen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Aymen Balbouli"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Bechir Ben Said"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Mohamed Drager"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Wajdi Kechrida"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Bilel Ifa"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Montassar Talbi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Dylan Bronn"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Yassine Meriah"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nader Ghandri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ali Maaloul"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ali Abdi"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ellyes Skhiri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Aissa Laidouni"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ferjani Sassi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ghailene Chaalali"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mohamed Ali Ben Romdhane"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Hannibal Mejbri"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Seifeddine Jaziri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Naim Sliti"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Taha Yassine Khenissi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Anis Ben Slimane"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Issam Jebali"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Wahbi Khazri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Youssef Msakni"));

		return new Selecao("Tunísia", new Pessoa(Tipo_Pessoa.TREINADOR, "Jalel Kadri"), jogadores);
	}

	// Grupo E

	protected static Selecao costaRica() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Keylor Navas"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Esteban Alvarado"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Patrick Sequeira"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Francisco Calvo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Bryan Oviedo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Óscar Duarte"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kendall Waston"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Rónald Matarrita"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Keysher Fuller"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Juan Pablo Vargas"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Carlos Martínez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Daniel Chacón"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Celso Borges"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Bryan Ruiz"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Yeltsin Tejeda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Gerson Torres"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jewison Bennette"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Youstin Salas"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Roan Wilson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Brandon Aguilera"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Douglas López"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Anthony Hernández"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Álvaro Zamora"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Joel Campbell"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Johan Venegas"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Anthony Contreras"));

		return new Selecao("Costa Rica", new Pessoa(Tipo_Pessoa.TREINADOR, "Luis Fernando Suárez"), jogadores);
	}

	protected static Selecao alemanha() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Manuel Neuer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Marc-Andre ter Stegen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Kevin Trapp"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Matthias Ginter"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Antonio Rudiger"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Niklas Suele"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nico Schlotterbeck"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Thilo Kehrer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "David Raum"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Lukas Klostermann"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Armel Bella Kotchap"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Christian Guenter"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ilkay Gundongan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jonas Hofmann"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Leon Goretzka"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Serge Gnabry"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Leryo Sane"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jamal Musiala"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Joshua Kimmich"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Thomas Müller"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Julian Brandt"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mario Goetze"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kai Havertz"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Youssoufa Muokoko"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Niklas Fuellkrug"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Karim Ademeyi"));

		return new Selecao("Alemanha", new Pessoa(Tipo_Pessoa.TREINADOR, "Hans-Dieter Flick"), jogadores);
	}

	protected static Selecao japao() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Eiji Kawashima"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Shūichi Gonda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Daniel Schmidt"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Miki Yamane"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Shōgo Taniguchi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kō Itakura"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Yūto Nagatomo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Takehiro Tomiyasu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Hiroki Sakai"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Maya Yoshida"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Hiroki Itō"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Wataru Endo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Gaku Shibasaki"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ritsu Dōan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kaoru Mitoma"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Takumi Minamino"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Takefusa Kubo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Hidemasa Morita"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Junya Ito"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Daichi Kamada"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ao Tanaka"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Yūki Sōma"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Takuma Asano"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Shūto Machino"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ayase Ueda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Daizen Maeda"));

		return new Selecao("Japão", new Pessoa(Tipo_Pessoa.TREINADOR, "Hajime Moriyasu"), jogadores);
	}

	protected static Selecao espanha() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Unai Simón"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Robert Sánchez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "David Raya"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Dani Carvajal"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "César Azpilicueta"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Eric García"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Hugo Guillamón"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Pau Torres"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Aymeric Laporte"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jordi Alba"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "José Gaya"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sergio Busquets"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Rodrigo Moreno"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pablo Gavi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Carlos Soler"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Marcos Llorente"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pedri González"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Koke"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ferrán Torres"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Nico Williams"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Yeremi Pino"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Álvaro Morata"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Marco Asensio"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Pablo Sarabia"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Dani Olmo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ansu Fati"));

		return new Selecao("Espanha", new Pessoa(Tipo_Pessoa.TREINADOR, "Luis Enrique"), jogadores);
	}

	// Grupo F

	protected static Selecao belgica() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Thibaut Courtois"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Simon Mignolet"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Koen Casteels"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jan Vertonghen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Toby Alderweireld"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Leander Dendoncker"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Zeno Debast"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Arthur Theate"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Wout Faes"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Hans Vanaken"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Axel Witsel"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Youri Tielemans"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Amadou Onana"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kevin De Bruyne"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Yannick Carrasco"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Thorgan Hazard"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Timothy Castagne"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Thomas Meunier"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Romelu Lukaku"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Michy Batshuayi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Lois Openda"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Charles De Ketelaere"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Eden Hazard"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "PJeremy Doku"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Dries Mertens"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Leandro Trossard"));

		return new Selecao("Bélgica", new Pessoa(Tipo_Pessoa.TREINADOR, "Roberto Martínez"), jogadores);
	}

	protected static Selecao canada() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "James Pantemis"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Milan Borjan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Dayne St. Clair"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Samuel Adekugbe"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joel Waterman"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Alistair Johnston"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Richie Laryea"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kamal Miller"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Steven Vitória"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Derek Cornelius"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Liam Fraser"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ismael Koné"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mark-Anthony Kaye"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "David Wotherspoon"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jonathan Osorio"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Atiba Hutchinson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Stephen Eustáquio"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Samuel Piette"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Liam Millar"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Lucas Cavallini"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Iké Ugbo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Tajon Buchanan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jonathan David"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Cyle Larin"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Alphonso Davies"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Junior Hoilett"));

		return new Selecao("Canadá", new Pessoa(Tipo_Pessoa.TREINADOR, "John Herdman"), jogadores);
	}

	protected static Selecao croacia() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Dominik Livakovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Ivica Ivusic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Ivo Grbic"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Domagoj Vida"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Dejan Lovren"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Borna Barisic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Josip Juranovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Josko Gvardiol"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Borna Sosa"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Josip Stanisic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Martin Erlic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Josip Sutalo"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Luka Modric"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mateo Kovacic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Marcelo Brozovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mario Pasalic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Nikola Vlasic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Lovro Majer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kristijan Jakic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Luka Sucic"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ivan Perisic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Andrej Kramaric"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Bruno Petkovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Mislav Orsic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ante Budimir"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Marko Livaja"));

		return new Selecao("Croácia", new Pessoa(Tipo_Pessoa.TREINADOR, "Zlatko Dalić"), jogadores);
	}

	protected static Selecao marrocos() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Yassine Bono"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Munir El Kajoui"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Reda Tagnaouti"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Achraf Hakimi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Noussair Mazraoui"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nayef Aguerd"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ghanem Saiss"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Achraf Dari"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jawad El Yamiq"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Yahya Attiat Allah"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Badr Benoun"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sofyan Amrabat"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Abdelhamid Sabiri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Selim Amallah"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Azzedine Ounahi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Bilal El Khannouss"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Yahya Jabrane"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Hakim Ziyech"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Sofiane Boufal"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Amine Harrit"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Abdessamad Ezzalzouli"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Zakaria Aboukhlal"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ilias Chair"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Youssef En-Nesyri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Walid Cheddira"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Abderrazak Hamdallah"));

		return new Selecao("Marrocos", new Pessoa(Tipo_Pessoa.TREINADOR, "Walid Regragui"), jogadores);
	}

	// Grupo G

	protected static Selecao brasil() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Alisson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Ederson"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Weverton"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Alex Sandro"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Alex Telles"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Danilo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Daniel Alves"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Bremer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Éder Militão"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Marquinhos"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Thiago Silva"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Bruno Guimarães"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Casemiro"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Fabinho"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Fred"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Lucas Paquetá"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Éverton Ribeiro"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Antony"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Gabriel Jesus"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Gabriel Martinelli"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Neymar"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Pedro"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Raphinha"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Richarlison"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Rodrygo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Vinícius Jr."));

		return new Selecao("Brasil", new Pessoa(Tipo_Pessoa.TREINADOR, "Tite"), jogadores);
	}

	protected static Selecao camaroes() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Devis Epsassy"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Simon Ngapandouentnbu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Andre Onana"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Jean-Charles Castelletto"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Enzo Ebosse"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Collins Fai"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Olivier Mbaizo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nicolas Nkoulou"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Tolo Nouhou"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Christopher Wooh"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Martin Hongla"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Pierre Kunde"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Olivier Ntcham"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Gael Ondoua"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Samuel Oum Gouet"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Andre-Frank Zambo Anguissa"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Vicent Aboubakar"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Christian Bassogog"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Eric-Maxime Choupo Moting"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Souaibou Marou"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Bryan Mbeumo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Nicolas Moumi Ngamaleu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jerome Ngom"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Georges-Kevin Nkoudou"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jean-Pierre Nsame"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Karl Toko Ekambi"));

		return new Selecao("Camarões", new Pessoa(Tipo_Pessoa.TREINADOR, "Rigobert Song"), jogadores);
	}

	protected static Selecao servia() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Marko Dmitrovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Predrag Rajkovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Vanja Milinkovic-Savic"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Stefan Mitrovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nikola Milenkovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Strahinja Pavlovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Milos Veljkovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Filip Mladenovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Strahinja Erakovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Srdan Babic"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Nemanja Gudelj"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sergej Milinkovic-Savic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Sasa Lukic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Marko Grujic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Filip Kostic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Uros Racic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Nemanja Maksimovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ivan Ilic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Andriza Zivkovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Darko Lazovic"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Dusan Tadic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Aleksandr Mitrovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Dusan Vlahovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Filip Duric"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Luka Jovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Nemanja Radonjic"));

		return new Selecao("Sérvia", new Pessoa(Tipo_Pessoa.TREINADOR, "Dragan Stojković"), jogadores);
	}

	protected static Selecao suica() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Gregor Kobel"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Philipp Kohn"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Jonas Omlin"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Yann Sommer"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Manuel Akanji"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nico Elvedi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Eray Comert"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ricardo Rodriguez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Fabian Schar"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Silvan Widmer"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Michel Aebischer"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Edimilson Fernandes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Fabian Frei"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Remo Freuler"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Ardon Jashari"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Fabian Rieder"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Djibril Sow"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Granit Xhaka"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Andriza Zivkovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Denis Zakaria"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Breel Embolo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Christian Fassnacht"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Noah Okafor"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Haris Seferovic"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Xherdan Shaqiri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Renato Steffen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Rubén Vargas"));

		return new Selecao("Suíça", new Pessoa(Tipo_Pessoa.TREINADOR, "Murat Yakın"), jogadores);
	}

	// Grupo H

	protected static Selecao gana() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Manaf Nurudeen"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Ibrahim Danlad"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Lawrence Ati-Zigi"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Denis Odoi"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Tariq Lamptey"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Alidu Seidu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Daniel Amartey"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Joseph Aidoo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Alexander Djiku"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Mohammed Salisu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Abdul-Rahman Baba"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Gideon Mensah"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Andre Ayew"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Thomas Partey"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Elisha Owusu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Salis Abdul Samed"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Mohammed Kudus"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Daniel-Kofi Kyeren"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Daniel Barnieh Afriyie"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kamal Sowah"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Issahaku Abdul Fatawu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Osman Bukari"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Inaki Williams"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Antoine Semenyo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Jordan Ayew"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Kamaldeen Sulemana"));

		return new Selecao("Gana", new Pessoa(Tipo_Pessoa.TREINADOR, "Otto Addo"), jogadores);
	}

	protected static Selecao portugal() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Diogo Costa"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "José Sá"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Rui Patrício"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Diogo Dalot"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "João Cancelo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Danilo Pereira"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Pepe"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Rúben Dias"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "António Silva"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Nuno Mendes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Raphael Guerreiro"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "João Palhinha"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Rúben Neves"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Bernardo Silva"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Bruno Fernandes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "João Mário"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Matheus Nunes"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Otávio Monteiro"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Vitinha"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "William Carvalho"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "André Silva"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Cristiano Ronaldo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Gonçalo Ramos"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "João Félix"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Rafael Leão"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Ricardo Horta"));

		return new Selecao("Portugal", new Pessoa(Tipo_Pessoa.TREINADOR, "Fernando Santos"), jogadores);
	}

	protected static Selecao coreia() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Kim Seung-Gyu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Jo Hyeon-Woo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Song Bum-Keun"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kim Min-jae"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kim Jin-su"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Hong Chul"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kim Moon-hwan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Yoon Jong-gyu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kim Young-gwon"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kim Tae-hwan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Kwon Kyung-won"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Cho Yu-min"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jung Woo-young"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Na Sang-ho"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Paik Seung-ho"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Son Jun-ho"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Song Min-kyu"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Kwon Chang-hoon"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Son Heung-min"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Lee Jae-sung"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Hwang Hee-chan"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Hwang In-beom"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Jeong Woo-yeong"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Lee Kang-in"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Hwang Ui-jo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Cho Gue-sung"));

		return new Selecao("Coreia do Sul", new Pessoa(Tipo_Pessoa.TREINADOR, "Paulo Jorge Gomes Bento"), jogadores);
	}

	protected static Selecao uruguai() {
		LinkedList<Pessoa> jogadores = new LinkedList<Pessoa>();

		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Fernando Muslera"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Sergio Rochet"));
		jogadores.add(new Pessoa(Tipo_Pessoa.GOLEIRO, "Sebastián Sosa"));

		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Ronald Araújo"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Martín Cáceres"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Sebastián Coates"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "José María Giménez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Diego Godín"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Mathías Olivera"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "José Luis Rodríguez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Guillermo Varela"));
		jogadores.add(new Pessoa(Tipo_Pessoa.DEFENSOR, "Matías Viña"));

		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Rodrigo Bentancur"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Giorgian de Arrascaeta"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Nicolás de la Cruz"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Facundo Pellistri"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Lucas Torreira"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Manuel Ugarte"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Federico Valverde"));
		jogadores.add(new Pessoa(Tipo_Pessoa.MEIO_CAMPISTA, "Matías Vecino"));

		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Agustín Canobbio"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Edinson Cavani"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Maximiliano Gómez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Darwin Núñez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Luis Suárez"));
		jogadores.add(new Pessoa(Tipo_Pessoa.ATACANTE, "Facundo Torres"));

		return new Selecao("Uruguai", new Pessoa(Tipo_Pessoa.TREINADOR, "Diego Alonso"), jogadores);
	}
}
