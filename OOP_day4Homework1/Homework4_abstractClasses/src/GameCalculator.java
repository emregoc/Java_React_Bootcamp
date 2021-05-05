
public abstract class GameCalculator { // abstract class tanimladik ama illa ki abstract methot
										// olacak diye bir sey yok yani asagidaki hesapla()
										// methotu olmadanda kullanilabilir, hem abstract hemde
										// normal methotta olabilir ya da sadece abstractta olabilir
										// Not : abstract sýnýflarda asla new ile instance 
									//olusturulamaz ama onun referanslarini new ile kullanabiliriz
									// mainde ornegi var
	
	// Not : Abstract class larýn normal classlardan tek farki burada tanimladigimiz abstract
	// methotlari zorunlu olarak diger yerlerde kullanmaliyiz
	
	public abstract void hesapla();// govdesi burada yok, govdesini nerede kullanmak istersek
								   // ona yerde override edilip kullanilmali, yani hangi class
								   // GameCalculator class'ini extend ederse bu hesapla methodunu
									// kullanmak zorunda
	
	public final void gameOver() { // final oldugu icin override edilemez ve degisemez
									// bu sekilde kullanilabilir
		
		System.out.println("Oyun Bitti");
		
	}
}
