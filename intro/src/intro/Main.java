package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String internetSubesiButonu = "Ýnternet þubeye gir";
		int vade = 36;
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		boolean dustuMu = false;

		System.out.println(internetSubesiButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		} else {
			System.out.println("Dolar eþittir resmi");
		}

		String[] krediler = {

				"Hýzlý kredi", "Mutlu Emekli kredisi", "Konut kredisi", "Çiftçi kredisi", "Msb kredisi", "Meb Kredisi",
				"Kültür bakanlýðý kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		
		sehir1=sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
	}

}
