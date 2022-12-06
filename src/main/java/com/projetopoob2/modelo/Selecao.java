/***
 *      _______        _           _ _             _____   ____   ____    __
 *     |__   __|      | |         | | |           |  __ \ / __ \ / __ \  /_ |
 *        | |_ __ __ _| |__   __ _| | |__   ___   | |__) | |  | | |  | |  | |
 *        | | '__/ _` | '_ \ / _` | | '_ \ / _ \  |  ___/| |  | | |  | |  | |
 *        | | | | (_| | |_) | (_| | | | | | (_) | | |    | |__| | |__| |  | |
 *        |_|_|  \__,_|_.__/ \__,_|_|_| |_|\___/  |_|     \____/ \____/   |_|

 * Alunos:
 * 		Hygor Oliveira Pancieri
 * 		Pâmella Roque
 * 		João Marcos
 * Professor:
 * 		Otavio Lube dos Santos
 *
 ***/

package com.projetopoob2.modelo;
import java.util.LinkedList;

public class Selecao {
	private String nome;
	private Pessoa tecnico;
	private LinkedList<Pessoa> jogadores;

	public Selecao(String nome, Pessoa tecnico, LinkedList<Pessoa> jogadores) {
		this.nome = nome;
		this.tecnico = tecnico;
		this.jogadores = jogadores;
	}

	public String getNome() { return nome; }
	public Pessoa getTecnico() { return tecnico; }
	public LinkedList<Pessoa> getJogadores() { return jogadores; }

	public void setNome(String nome) { this.nome = nome; }
	public void setTecnico(Pessoa tecnico) { this.tecnico = tecnico; }
	public void setJogadores(LinkedList<Pessoa> jogadores) { this.jogadores = jogadores; }
}
