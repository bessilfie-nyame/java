public class BarkingDog{

	private static int  minRange = 0;
	private static int maxRange = 23;

	private static int  barkMinRange = 8;
	private static int barkMaxRange = 22;	

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		
		if (hourOfDay >= minRange && hourOfDay <= maxRange){
			return (barking && (hourOfDay < barkMinRange || hourOfDay > barkMaxRange));
		}

		return false;
	}
}