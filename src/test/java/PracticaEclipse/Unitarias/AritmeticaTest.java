package PracticaEclipse.Unitarias;

import org.testng.Assert;
import org.testng.annotations.Test;

import PracticaEclipse.Unitarias.Utilitario.Abstract;


public class AritmeticaTest extends Abstract {

	int resultado = 0;

	@Test
	public void testSuma() {

		resultado = arit.suma(numero1, numero2);

		try {

			Assert.assertEquals(3, resultado);

		} catch (AssertionError e) {

			org.testng.Assert.fail("No da el mismo resultado se esperaba: 3");
			
		}

	}

	@Test
	public void testResta() {
		try {

			resultado = arit.resta(numero1, numero2);
			
			Assert.assertEquals(-1, resultado);

		} catch (AssertionError e) {

			org.testng.Assert.fail("No da el mismo resultado se espereba: -1");
			
		}
	}

	@Test
	public void testMultiplicacion() {
		
		resultado = arit.multiplicacion(numero1, numero2);
		try {

			Assert.assertEquals(2, resultado );

		} catch (AssertionError e) {

			org.testng.Assert.fail("No da el mismo resultado se esperaba: 2");
			
		}
	}
	
	@Test
	public void testMultiplicacion2() {
		
		resultado = arit.multiplicacionXdos(numero1, numero2);
		try {

			Assert.assertEquals(4, resultado );

		} catch (AssertionError e) {

			org.testng.Assert.fail("No da el mismo resultado se esperaba: 4");
			
		}
	}

	@Test
	public void testDivision() {
		try {

			resultado = arit.division(numero1, numero2);
			
			Assert.assertEquals(0, resultado);

		} catch (AssertionError e) {

			org.testng.Assert.fail("No da el mismo resultado se esperaba: 0");
			
		}
	}
}
