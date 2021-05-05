
public class ManGameCalculator extends GameCalculator{// if erkek ise if kadinsa diye tanimlamak
											//yanlis o yuzden buraya erkek icin class olusturduk
	@Override
	public void hesapla() { // GameCalculator abstract class taki abstract hesapla() methotunu
							// Override ediyoruz
		
		System.out.println("Erkek oyuncularin Puani : 90");
		
	}
	
	
}
