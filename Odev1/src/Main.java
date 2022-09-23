
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �lk kod
		System.out.println("Hello World ");
		// veriable
		int ogrenciSayisi = 9;
		String mesaj1 = "��renci Say�s�: ";

		System.out.println(mesaj1 + ogrenciSayisi);

		// tip d�n���mleriyle toplama i�lemi:
		System.out.println(2 + ogrenciSayisi);
		System.out.println("---------------------------------------");
		System.out.println("Conditionals");
		// if Bloklar�
		int sayi = 20;
		if (sayi < 20) {
			System.out.println("Sayi 20 den k���k");

		} else if (sayi > 20) {
			System.out.println("Sayi 20 den b�y�kt�r");
		} else {
			System.out.println("Sayi 20 e e�ittir");
		}
		System.out.println("---------------------------------------");
		System.out.println("switch");
		char grade = 'A';
		switch (grade) {
		case 'A':

			System.out.println("M�kemmel: Ge�tiniz");
			break;

		case 'B':
			System.out.println("�ok G�zel : Ge�tiniz");
			break;

		case 'C':
			System.out.println("�yi  : Ge�tiniz. ");
			break;

		case 'D':
			System.out.println("Fena de�il  : Ge�tiniz. ");
			break;

		case 'F':
			System.out.println("Maalesef : Kald�n�z.");
			break;

		default:
			System.out.println("Hatal� bir de�er girdiniz.");
			break;
		}
		System.out.println("---------------------------------------");
		System.out.println("loops");
		// for d�ng�s�

		for (int i = 1; i < 10; i += 2) {
			System.out.println("Tek sayi : " + i);

		}
		System.out.println("for  d�ng�s� bitti");

		// While d�ng�s�
		int i = 2;
		while (i < 10) {
			System.out.println("�ift sayi: " + i);
			i += 2;
		}
		System.out.println("while d�ng�s� bitti");

		// do-while d�ng�s�
		int j = 100;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("do-while d�ng�s� bitti");
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
		sehirler[0][0] = "�stanbul";
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
				System.out.println((y + 1) + "." + "B�lge �ehirlerimiz: " + sehirler[y][b]);
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("STRINGS");
		System.out.println("---------------------------------------");
		String mesaj = "Bugun hava �ok g�zel";
		System.out.println("Mesaj�n�z :" + mesaj);
		System.out.println("mesaj�n eleman say�s�: " + mesaj.length());
		System.out.println("5.Eleman: " + mesaj.charAt(4));
		String mesaj2 = mesaj.concat(" Ya�as�n...");
		System.out.println("2 metni birle�tirme: " + mesaj2);
		System.out.println("Yeni metin uzunlu�u : " + mesaj2.length());
		System.out.println("mesaj 'B' ile mi ba�l�yor?: " + mesaj.startsWith("B"));
		System.out.println("Mesaj 'T' ile mi bitiyor? : " + mesaj.endsWith("T"));
		char[] karakter = new char[5];
		mesaj.getChars(0, 4, karakter, 0);
		System.out.println("�stenilen karakterler: " + karakter);
		System.out.println("�lk 'a' harfi BA�TAN ka��nc� s�rada: "+mesaj.indexOf('a'));
		System.out.println("�lk 'a' harfi SONDAN ka��nc� s�rada: "+mesaj.lastIndexOf('a'));
		System.out.println("Bo�luklar� '/'ile de�i�tirme i�lemi : "+mesaj.replace(" ", "/"));
		System.out.println("2-8 indexleri aras�nda kalan harflerin yaz�lmas� : "+mesaj.substring(2, 8));
		System.out.println("T�m harfleri b�y�k yazd�r�n : "+mesaj.toUpperCase());
		System.out.println("T�m harfleri k���k yazd�r�n : "+mesaj.toLowerCase());
		for(String kelimeler: mesaj.split(" ")) {
			System.out.println(kelimeler);
		}
		
	}

}
