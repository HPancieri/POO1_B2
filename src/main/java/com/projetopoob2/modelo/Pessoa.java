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

public class Pessoa {
	private Tipo_Pessoa tipo;
	private String nome;

	public Pessoa(Tipo_Pessoa tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public String getNome() { return nome; }
	public Tipo_Pessoa getTipo() { return tipo; }

	public void setTipo(Tipo_Pessoa tipo) { this.tipo = tipo; }
	public void setNome(String nome) { this.nome = nome; }
}
