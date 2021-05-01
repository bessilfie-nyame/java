public class PlayingCat{
	
	private static int minTemperature = 25;
	private static int maxTemperature = 35;

	public static boolean isCatPlaying(boolean summer, 
		int temperature){

		if (summer){
			maxTemperature = 45;
		}

		return (minTemperature < temperature 
				&& temperature <= maxTemperature);
	}
}