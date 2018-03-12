package PracticaEclipse.Unitarias;

import org.testng.Assert;
import org.testng.annotations.Test;

import PracticaEclipse.Unitarias.Utilitario.Abstract;
import ru.yandex.qatools.allure.annotations.Title;

public class AritmeticaTest extends Abstract {

	int resultado = 0;

	@Title("Prueba de Suma")
	@Test
	public void testSuma() {

		resultado = arit.suma(numero1, numero2);

		try {

			Assert.assertEquals(3, resultado);

		} catch (AssertionError e) {

			log.enviarLog("Resultado Suma", resultado + "");
			org.testng.Assert.fail("No da el mismo resultado se esperaba: 3");
			
		}

	}

	@Title("Prueba resta")
	@Test
	public void testResta() {
		try {

			resultado = arit.resta(numero1, numero2);
			
			Assert.assertEquals(5, resultado);

		} catch (AssertionError e) {

			log.enviarLog("Resultado resta", resultado + "");
			org.testng.Assert.fail("No da el mismo resultado se espereba: 5");
			
		}
	}

	@Title("Prueba multiplicar")
	@Test
	public void testMultiplicacion() {
		
		resultado = arit.multiplicacion(numero1, numero2);
		try {

			Assert.assertEquals(2, resultado );

		} catch (AssertionError e) {

			log.enviarLog("Resultado de Multiplicacion", resultado + "");
			org.testng.Assert.fail("No da el mismo resultado se esperaba: 2");
			
		}
	}
	
	@Title("Prueba multiplicar por 2")
	@Test
	public void testMultiplicacion2() {
		
		resultado = arit.multiplicacionXdos(numero1, numero2);
		try {

			Assert.assertEquals(3, resultado );

		} catch (AssertionError e) {

			log.enviarLog("Resultado de Multiplicacion", resultado + "");
			org.testng.Assert.fail("No da el mismo resultado se esperaba: 4");
			
		}
	}

	@Title("Prueba dividir")
	@Test
	public void testDivision() {
		try {

			resultado = arit.division(numero1, numero2);
			
			Assert.assertEquals(0, resultado);

		} catch (AssertionError e) {

			log.enviarLog("Resultado Division", resultado + "");
			org.testng.Assert.fail("No da el mismo resultado se esperaba: 0");
			
		}
	}
}
