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

public class Rodada {
	private Partida[] partidas;
	private LocalDateTime data_limite;

	public Rodada(Partida[] partidas, LocalDateTime data_limite) {
		this.partidas = partidas;
		this.data_limite = data_limite;
	}

	public Partida[] getPartidas() { return partidas; }
	public LocalDateTime getData_limite() { return data_limite; }

	public void setPartidas(Partida[] partidas) { this.partidas = partidas; }
	public void setData_limite(LocalDateTime data_limite) { this.data_limite = data_limite; }
}
