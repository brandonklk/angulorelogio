package org.brandonklk.angulorelogio.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Classe utilitária usada na solução para realizar a verificação do ângulo.
 * Como a função é crítica para o funcionamento decidi tornar a classe e o
 * métodos finais evitando que alguem possa herdar dela (extends) e substituir a
 * lógica.
 *
 * @author Brandon Marcos Kluck
 */
public final class Formula {

	/**
	 * Método utilitário que rece um horário e retorna um ângulo correspondente.
	 *
	 * O uso do final no método permite ao compilador do Java otimizar o código para
	 * execução.
	 *
	 * @param horario para o qual será retornado o ângulo
	 * @return um ângulo variando de Zero Graus até 360 Graus
	 */
	public final static long retornaAnguloRelogio(GregorianCalendar horario) {
		int hora = horario.get(Calendar.HOUR);
		int minuto = horario.get(Calendar.MINUTE);

		long anguloHora = 30 * hora;
		long anguloMinuto = 0;

		/**
		 * Relogio maior ou igual a 0 e menor ou igual a 15
		 * 
		 * Em certas situaçoes em que a hora esta em 45 graus (00:15), com isso somamos o resultado e subtraimos por 15 minutos.
		 *
		 * O ultimo if o ponteiro esta entre 45 e 60 minutos, então pegamos a distancia total ate 45 minutos, então somamos a area total ate 45 minutos e 
		 * depois pegamos os minutos atual e diminuimos menor 45 graus e no final é dividido por 3 que é o os graus por minuto. 
		 * 
		 * 
		 */
		if (minuto >= 0 && minuto <= 15) {
			anguloMinuto = minuto * 3;
		} else if (minuto <= 45) {
			anguloMinuto = 45 + (minuto - 15) * 9;
		} else if (minuto < 60) {
			anguloMinuto = 315 + (minuto - 45) * 3;
		}

		long anguloRelogio = Math.abs(minuto - hora);

		anguloRelogio = Math.min(anguloRelogio, 360 - anguloRelogio);
		return anguloRelogio;
	}
}
