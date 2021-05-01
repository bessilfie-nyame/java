public class TeenNumberChecker{

	private static int minRange = 13;
	private static int maxRange = 19;

	public static boolean isTeen(int age){
		return (minRange <= age && age <= maxRange);
	}

	public static boolean hasTeen(int x, int y, int z) {
		return (isTeen(x) || isTeen(y) || isTeen(z));
	}
}