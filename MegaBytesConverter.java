public class MegaBytesConverter{
	
	private static int convertRate = 1024;

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		int megaBytes = kiloBytes / convertRate;
		int extraKiloBytes = kiloBytes - (megaBytes * convertRate);

		if (kiloBytes >= 0){
			System.out.printf("%d KB = %d MB and %d KB", 
							   kiloBytes, megaBytes, extraKiloBytes);		
		}

		else 
			System.out.println("Invalid Value");
	}	
}