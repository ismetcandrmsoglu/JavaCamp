package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 30;

		DortIslem dortIslem = new DortIslem();
		System.out.println("1:Toplama Ýþlemi=> " + dortIslem.Toplama(sayi1, sayi2));
		System.out.println("2:Çýkarma Ýþlemi=> " + dortIslem.Cikarma(sayi1, sayi2));
		System.out.println("3:Çarpma iþlemi=> " + dortIslem.Carpma(sayi1, sayi2));
		System.out.println("4:Bölme Ýþlemi=> " + dortIslem.Bolme(sayi1, sayi2));	

	}

}
