
public class Calculate {
	
	public static double add (double val1, double val2) {
		double sum = val1 + val2;
		return sum;
	}
	
	public static double subtract (double val1, double val2) {
		double difference = val1 - val2;
		return difference;
	}
	
	public static double multiply (double val1, double val2) {
		double product = val1 * val2;
		return product;
	}
	
	public static double[] divide (double val1, double val2) {
		double[] div= new double[2];
		if (val2 == 0) {
			div[0] = 1;
			return div;
		}
		else {
			div[0] = 0;
			div[1] = val1/val2;
			return div;
		}
		
	}
	public static double exponent (double val1, double val2) {
		double power = Math.pow(val1, val2);
		return power;
	}
}

