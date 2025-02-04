package feb04example;

/**
 * Examples for today.
 * 
 * @author sdkennedy, others
 */
public class Converter {

	/**
	 * Add numbers.  Just an example method.
	 * @param a first num
	 * @param b second num
	 * @return the sum of a and b
	 */
	public double add(double a, double b) {
		double result = a + b;
		return result;
	}
	
	// canadian dollar to dollar, it just works yall
	/**
	 * Convert USD to CAD using rate from 2/4/25
	 * 
	 * Thanks Aom and Isaac!
	 * 
	 * @param usd
	 * @return CAD
	 */
	public double convert(double usd) {
		double rate = 1.44;
		return usd * rate;
	}
	
	/**
	 * A generic currency conversion.
	 * 
	 * Thanks Chris, Isaac, and Aom!
	 * @param usd
	 * @param rate
	 * @return the new value
	 */
	public double convert(double usd, double rate) {
		return usd * rate;
	}

}
