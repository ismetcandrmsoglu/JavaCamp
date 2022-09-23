
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ýlk kod
		System.out.println("Hello World ");
		// veriable
		int ogrenciSayisi = 9;
		String mesaj1 = "Öðrenci Sayýsý: ";

		System.out.println(mesaj1 + ogrenciSayisi);

		// tip dönüþümleriyle toplama iþlemi:
		System.out.println(2 + ogrenciSayisi);
		System.out.println("---------------------------------------");
		System.out.println("Conditionals");
		// if Bloklarý
		int sayi = 20;
		if (sayi < 20) {
			System.out.println("Sayi 20 den küçük");

		} else if (sayi > 20) {
			System.out.println("Sayi 20 den büyüktür");
		} else {
			System.out.println("Sayi 20 e eþittir");
		}
		System.out.println("---------------------------------------");
		System.out.println("switch");
		char grade = 'A';
		switch (grade) {
		case 'A':

			System.out.println("Mükemmel: Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;

		case 'C':
			System.out.println("Ýyi  : Geçtiniz. ");
			break;

		case 'D':
			System.out.println("Fena deðil  : Geçtiniz. ");
			break;

		case 'F':
			System.out.println("Maalesef : Kaldýnýz.");
			break;

		default:
			System.out.println("Hatalý bir deðer girdiniz.");
			break;
		}
		System.out.println("---------------------------------------");
		System.out.println("loops");
		// for döngüsü

		for (int i = 1; i < 10; i += 2) {
			System.out.println("Tek sayi : " + i);

		}
		System.out.println("for  döngüsü bitti");

		// While döngüsü
		int i = 2;
		while (i < 10) {
			System.out.println("Çift sayi: " + i);
			i += 2;
		}
		System.out.println("while döngüsü bitti");

		// do-while döngüsü
		int j = 100;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("do-while döngüsü bitti");
		System.out.println("---------------------------------------");
		System.out.println(" array");
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Berna";
		ogrenciler[1] = "Yusuf";
		ogrenciler[2] = "Ziya";
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("---------------------------------------");

		System.out.println("Multi dimensional array");

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Kars";
		sehirler[2][1] = "Bayburt";
		sehirler[2][2] = "Erzurum";

		for (int y = 0; y < sehirler.length; y++) {
			System.out.println("**************************************");
			for (int b = 0; b < sehirler.length; b++) {
				System.out.println((y + 1) + "." + "Bölge Þehirlerimiz: " + sehirler[y][b]);
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("STRINGS");
		System.out.println("---------------------------------------");
		String mesaj = "Bugun hava çok güzel";
		System.out.println("Mesajýnýz :" + mesaj);
		System.out.println("mesajýn eleman sayýsý: " + mesaj.length());
		System.out.println("5.Eleman: " + mesaj.charAt(4));
		String mesaj2 = mesaj.concat(" Yaþasýn...");
		System.out.println("2 metni birleþtirme: " + mesaj2);
		System.out.println("Yeni metin uzunluðu : " + mesaj2.length());
		System.out.println("mesaj 'B' ile mi baþlýyor?: " + mesaj.startsWith("B"));
		System.out.println("Mesaj 'T' ile mi bitiyor? : " + mesaj.endsWith("T"));
		char[] karakter = new char[5];
		mesaj.getChars(0, 4, karakter, 0);
		System.out.println("Ýstenilen karakterler: " + karakter);
		System.out.println("Ýlk 'a' harfi BAÞTAN kaçýncý sýrada: "+mesaj.indexOf('a'));
		System.out.println("Ýlk 'a' harfi SONDAN kaçýncý sýrada: "+mesaj.lastIndexOf('a'));
		System.out.println("Boþluklarý '/'ile deðiþtirme iþlemi : "+mesaj.replace(" ", "/"));
		System.out.println("2-8 indexleri arasýnda kalan harflerin yazýlmasý : "+mesaj.substring(2, 8));
		System.out.println("Tüm harfleri büyük yazdýrýn : "+mesaj.toUpperCase());
		System.out.println("Tüm harfleri küçük yazdýrýn : "+mesaj.toLowerCase());
		for(String kelimeler: mesaj.split(" ")) {
			System.out.println(kelimeler);
		}
		
	}

}
