package PracticaEclipse.Unitarias;

public class Aritmetica {
	
	public int suma(int primerSumando, int segundoSumando) {
		return  (primerSumando + segundoSumando);
	}

	public int resta(int minuendo, int sustraendo) {
		return  (minuendo - sustraendo);
	}

	public int multiplicacion(int primerFactor, int segundoFactor) {
		return  (primerFactor * segundoFactor);
	}
	
	public int multiplicacionXdos(int primerFactor, int segundoFactor) {
		
		return ((primerFactor * segundoFactor)*2);
		
	}

	public int division(int dividendo, int divisor) {
		return  (dividendo / divisor);
	}

}
