package methods;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;
		sayiBulmaca(sayilar, aranacak, varMi);
		mesajVer(varMi,aranacak);
	}

	public static void sayiBulmaca(int[] sayilar, int aranacak, boolean varMi) {

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
	
	}

	public static void mesajVer(boolean varMi, int aranacak) {
		if (varMi == true) {
			System.out.println("Sayi mevcuttur: "+aranacak);
		} else {
			System.out.println("Sayi mevcut deðildir: "+aranacak);
		}
	}

}
