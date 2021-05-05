
public class Main {

	public static void main(String[] args) {
		
		
		GameCalculator gameCalculator = new WomenGameCalculator(); // bu sekilde abstract sinifa
																 // ait referans siniflardan
																// instance olusturabiliriz
																// bu sayede WomenGameCalculator()
																// yerine basla bir ozellik
																// eklemek istersek 
																// buradan degistirebiliriz
		gameCalculator.hesapla();
		gameCalculator.gameOver(); // WomenGameCalculator() classi GameCalculator() classindan extend edildigi 
									// icin bu methodata ulasabildik
	}

}
