package org.brandonklk.angulorelogio.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
* Classe utilitária usada na solução para realizar a verificação do ângulo.
* Como a função é crítica para o funcionamento decidi tornar a classe e o métodos
* finais evitando que alguem possa herdar dela (extends) e substituir a lógica.
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

		hora *= 30;
		minuto *= 3;

		long angulo;

		if (hora > minuto) {
			angulo = hora - minuto;
		} else {
			angulo = minuto - hora;
		}

		return angulo;
	}
}
