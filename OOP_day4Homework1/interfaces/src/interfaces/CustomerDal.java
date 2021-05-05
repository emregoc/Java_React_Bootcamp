package interfaces;

public interface CustomerDal { // CustomerDal daki Dal = data access layer (veri erisim katmani)
								
			// NOT !! : interface lerde de nerde implement edilmisse interfaceye yazilan methodlar orada mecbur
			// kullanilmali ve o methodun uzerine override yapilmali
			// NOT2 !! : interfaceler de abstarctlar gibi new yazilip instance olusturulamaz
			// NOT3 !! : interface'i implement eden classin referansini tutabilir mainde ornegi var
			// NOT4 !! : interfaceler de bir class birden fazla interface yi implement edebilir ama abstract
			// 			 sýnýflarda bir class tek bir classý extend edebilir
	
	void add(); // interface de method default olarak public oluyor bir sey vermezsek
	
}
