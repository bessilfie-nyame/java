public class DecimalComparator{
	
	public static double toThreeDecimalPlaces(double decimalVal){

		// Divide and multiply by thousand (10^3 --> 3 decimal places)
		return Math.ceil(decimalVal * 1000) / 1000;
	}

	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		
		return toThreeDecimalPlaces(x) == toThreeDecimalPlaces(y);
	}	
}