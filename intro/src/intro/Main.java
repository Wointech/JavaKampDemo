package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String internetSubesiButonu = "�nternet �ubeye gir";
		int vade = 36;
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		boolean dustuMu = false;

		System.out.println(internetSubesiButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		} else {
			System.out.println("Dolar e�ittir resmi");
		}

		String[] krediler = {

				"H�zl� kredi", "Mutlu Emekli kredisi", "Konut kredisi", "�ift�i kredisi", "Msb kredisi", "Meb Kredisi",
				"K�lt�r bakanl��� kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		
		sehir1=sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
	}

}
