package org.brandonklk.angulorelogio;

import java.text.SimpleDateFormat;

import java.util.GregorianCalendar;

import org.brandonklk.angulorelogio.util.Formula;

/**
 * Demonstra o funcionamento do programa do calculo do ângulo com base na
 * hora atual do sistema.
 * 
 * @author Brandon Marcos Kluck
 *
 */
public class App {

	/**
	 * Método principal usado para demonstrar a execução com a hora atual
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Date agora = new java.util.Date();
		GregorianCalendar horario = new GregorianCalendar();

		String data = "dd/MM/yyyy";
		String hora = "HH:mm";
		String dataAtual, horaAtual;

		SimpleDateFormat formata = new SimpleDateFormat(data);
		dataAtual = formata.format(agora);

		formata = new SimpleDateFormat(hora);
		horaAtual = formata.format(agora);

		System.out.print(dataAtual + " " + " Horas: ");
		System.out.print(horaAtual + "");

		System.out.println(" = " + Formula.retornaAnguloRelogio(horario) + " graus");

	}
}
