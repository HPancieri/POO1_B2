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

public class Aposta {
	private Rodada rodada;
	private final double valor_aposta;
	private int total_pontos;
	private final Rodada aposta;

	// valor_aposta e aposta são 'final', pois uma aposta é imutável.
	// rodada não pode ser 'final', pois a aposta é feita antes de uma rodada acontecer,
	// portanto ela deverá ser atualizada posteriormente.

	public Aposta(Rodada rodada, double valor_aposta, Rodada aposta) {
		this.rodada = rodada;
		this.valor_aposta = valor_aposta;
		this.aposta = aposta;
		// Total pontos não deve ser inicializado no construtor,
		// pois a aposta é feita antes do resultado da rodada.
	}

	public Rodada getRodada() { return rodada; }
	public double getValor_aposta() { return valor_aposta; }
	public int getTotal_pontos() { return total_pontos; }
	public Rodada getAposta() { return aposta; }

	public void setRodada(Rodada rodada) { this.rodada = rodada; }
	public void setTotal_pontos() { this.total_pontos = this.getTotalPontos(); }

	public int[] getGolsMandante() {
		int numeroPartidas = this.rodada.getPartidas().length;
		int[] golsMandante = new int[numeroPartidas];

		for (int i = 0; i < numeroPartidas; i++) {
			golsMandante[i] = this.rodada.getPartidas()[i].getGols_mandante();
		}

		return golsMandante;
	}

	public int[] getGolsVisitante() {
		int numeroPartidas = this.rodada.getPartidas().length;
		int[] golsVisitante = new int[numeroPartidas];

		for (int i = 0; i < numeroPartidas; i++) {
			golsVisitante[i] = this.rodada.getPartidas()[i].getGols_visitante();
		}

		return golsVisitante;
	}

	public int getTotalPontos() {
		int totalPontos = 0;

		int numeroPartidas = this.rodada.getPartidas().length;
		int[] golsMandante = this.getGolsMandante();
		int[] golsVisitante = this.getGolsVisitante();

		int[] golsApostaMandante = new int[numeroPartidas];
		int[] golsApostaVisitante = new int[numeroPartidas];

		for (int i = 0; i < numeroPartidas; i++) {
			golsApostaMandante[i] = this.aposta.getPartidas()[i].getGols_mandante();
			golsApostaVisitante[i] = this.aposta.getPartidas()[i].getGols_visitante();
		}

		for (int i = 0; i < numeroPartidas; i++) {
			if (golsMandante[i] == golsApostaMandante[i] && golsVisitante[i] == golsApostaVisitante[i]) {
				// Acertou o placar do jogo.
				totalPontos += 10;
			} else if (golsMandante[i] > golsVisitante[i] && golsApostaMandante[i] > golsApostaVisitante[i]) {
				// Acertou que o mandante ganharia.
				totalPontos += 5;
			} else if (golsMandante[i] < golsVisitante[i] && golsApostaMandante[i] < golsApostaVisitante[i]) {
				// Acertou que o visitante ganharia.
				totalPontos += 5;
			} else if (golsMandante[i] == golsApostaMandante[i] || golsVisitante[i] == golsApostaVisitante[i]) {
				// Acertou a quantidade de gols de apenas um das seleções.
				totalPontos += 2;
			}
		}

		return totalPontos;
	}
}
