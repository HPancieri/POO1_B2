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

public class Apostador {
	private String nome;
	private String cpf;
	private String email;
	private String numero_da_conta;

	public Apostador(String nome, String cpf, String email, String numero_da_conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.numero_da_conta = numero_da_conta;
	}

	public String getNome() { return nome; }
	public String getCpf() { return cpf; }
	public String getEmail() { return email; }
	public String getNumero_da_conta() { return numero_da_conta; }

	public void setNome(String nome) { this.nome = nome; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setEmail(String email) { this.email = email; }
	public void setNumero_da_conta(String numero_da_conta) { this.numero_da_conta = numero_da_conta; }
}
