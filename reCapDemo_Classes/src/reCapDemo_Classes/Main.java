package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 30;

		DortIslem dortIslem = new DortIslem();
		System.out.println("1:Toplama ��lemi=> " + dortIslem.Toplama(sayi1, sayi2));
		System.out.println("2:��karma ��lemi=> " + dortIslem.Cikarma(sayi1, sayi2));
		System.out.println("3:�arpma i�lemi=> " + dortIslem.Carpma(sayi1, sayi2));
		System.out.println("4:B�lme ��lemi=> " + dortIslem.Bolme(sayi1, sayi2));	

	}

}
