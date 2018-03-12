package PracticaEclipse.Unitarias.Utilitario;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import PracticaEclipse.Unitarias.Aritmetica;

public abstract class Abstract {

	protected int numero1;
	protected int numero2;
	
	
	protected Aritmetica arit;

	@Parameters({ "numero1", "numero2" })
	@BeforeClass
	public void setUp(int numero1, int numero2) {

		arit = new Aritmetica();

		this.numero1 = numero1;
		this.numero2 = numero2;

	}

	@AfterClass
	public void setOut() {

		this.numero1 = 0;
		this.numero2 = 0;

	}

}
