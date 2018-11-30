package org.brandonklk.angulorelogio;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.brandonklk.angulorelogio.util.Formula;
import org.junit.Test;

/**
 * Realiza os testes propostos na tarefa definida pela Neomind
 * @author Brandon Marcos Kluck
 *
 */
public class AppTest {


	/**
	 * Testa se a hora definida e passada é meia noite, ou seja, 00:00
	 */
	@Test
	void testHourShouldBeZeroDegree() {
		GregorianCalendar horario = new GregorianCalendar();
		
		horario.set(Calendar.HOUR      , 0);
		horario.set(Calendar.MINUTE,0);
		
		// Valor que a minha lógica retornou
		final long  ANGULO_RETORNADO = Formula.retornaAnguloRelogio(horario);
		// Valor que deve ser retornado
		final long  ANGULO_ESPERADO  = 0;
		
		// Se os dois valores forem iguais o programa esta funcionando
		assertEquals(ANGULO_RETORNADO, ANGULO_ESPERADO);
		
	}
	
	/**
	 * Testa se a hora definida e passada é meia noite, ou seja, 00:00
	 */
	@Test
	void testHourShouldBe45Degrees() {
		GregorianCalendar horario = new GregorianCalendar();
		
		horario.set(Calendar.HOUR  , 0);
		horario.set(Calendar.MINUTE,15);
		
		// Valor que a minha lógica retornou
		final long  ANGULO_RETORNADO = Formula.retornaAnguloRelogio(horario);
		// Valor que deve ser retornado
		final long  ANGULO_ESPERADO  = 45;
		
		// Se os dois valores forem iguais o programa esta funcionando
		assertEquals(ANGULO_RETORNADO, ANGULO_ESPERADO);
		
	}
	
	@Test
	void testHourShouldBe180Degrees() {
		GregorianCalendar horario = new GregorianCalendar();
		
		horario.set(Calendar.HOUR  , 0);
		horario.set(Calendar.MINUTE,30);
		
		// Valor que a minha lógica retornou
		final long  ANGULO_RETORNADO = Formula.retornaAnguloRelogio(horario);
		// Valor que deve ser retornado
		final long  ANGULO_ESPERADO  = 180;
		
		System.out.println("VALOR RETORNADO " +  ANGULO_RETORNADO );
		
		// Se os dois valores forem iguais o programa esta funcionando
		assertEquals(ANGULO_RETORNADO, ANGULO_ESPERADO);
		
	}
        @Test
        void testHourShouldBe72Degrees() {
		GregorianCalendar horario = new GregorianCalendar();
		
		horario.set(Calendar.HOUR  , 0);
		horario.set(Calendar.MINUTE,24);
		
		// Valor que a minha lógica retornou
		final long  ANGULO_RETORNADO = Formula.retornaAnguloRelogio(horario);
		// Valor que deve ser retornado
		final long  ANGULO_ESPERADO  = 24;
		
		// Se os dois valores forem iguais o programa esta funcionando
		assertEquals(ANGULO_RETORNADO, ANGULO_ESPERADO);
		
	}

}
