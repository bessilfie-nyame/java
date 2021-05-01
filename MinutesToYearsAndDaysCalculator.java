public class MinutesToYearsAndDaysCalculator{

	public static void printYearsAndDays(long minute) {

		long hour = minute / 60;
		long day = hour / 24;
		long year = day / 365;
		day = day % 365;

		if (minute != 0){
			System.out.printf("%s min = %s y and %s d", minute, year, day);
		}

		else
			System.out.println("Invalid Value");
	}	
}