public class SpeedConverter{

	private static double convertRate = 1.609;
	
	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour >= 0){
			return (long) Math.round(kilometersPerHour / convertRate);
		}

		return -1L;
	}	


	public static void printConversion(double kilometersPerHour){
		
		long milesPerHour = toMilesPerHour(kilometersPerHour);

		if (milesPerHour != -1L){
			System.out.printf("%s km/h = %s mi/h", (float) kilometersPerHour, milesPerHour);
		}
		else 
			System.out.println("Invalid Value");		
	}
}