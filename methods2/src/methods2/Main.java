package methods2;

public class Main {

	public static void main(String[] args) {
		
		//int methods
		int number1 = 20;
		int number2 = 30;
		System.out.println("�ki say�n�n toplam�: " + addition(number1, number2));

		//String Methods
		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = sehirVer() + " " + mesaj;
		System.out.println(yeniMesaj);
		
		
        //variable arguments
		int toplam = addition2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 68, 16);
		System.out.println("Birden fazla say�n�n toplam�:  " + toplam);
	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void g�ncelle() {

	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int addition2(int... numbers) {
		int addition = 0;
		for (int number : numbers) {
			addition += number;

		}
		return addition;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
