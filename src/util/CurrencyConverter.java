package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static Double converterDolarEmReal(Double totalDolares, Double precoDolar) {
		Double valorTotal = totalDolares * precoDolar * (1.0 + IOF);
		
		return valorTotal;
	}

}
