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
import java.time.LocalDateTime;

public class Partida {
	private final Selecao mandante;
	private final Selecao visitante;
	private int gols_mandante;
	private int gols_visitante;
	private LocalDateTime tempo;
	private Selecao vencedor;

	// Os atributos mandante e visitante serão 'final', pois não faz sentido alterar essas
	// informações depois da definição da partida.

	public Partida(Selecao mandante, Selecao visitante, LocalDateTime tempo) {
		this.mandante = mandante;
		this.visitante = visitante;
		this.tempo = tempo;
		// Os campos vencedor, gols_mandante e gols_visitante não pode estar presente no construtor,
		// pois não se têm essas informações no início da partida.
	}

	public Selecao getMandante() { return mandante; }
	public Selecao getVisitante() { return visitante; }
	public int getGols_mandante() { return gols_mandante; }
	public int getGols_visitante() { return gols_visitante; }
	public LocalDateTime getTempo() { return tempo; }
	public Selecao getVencedor() { return vencedor; }

	public void setGols_mandante(int gols_mandante) { this.gols_mandante = gols_mandante; }
	public void setGols_visitante(int gols_visitante) { this.gols_visitante = gols_visitante; }
	public void setTempo(LocalDateTime tempo) { this.tempo = tempo; }
	public void setVencedor(Selecao vencedor) { this.vencedor = vencedor; }
}
