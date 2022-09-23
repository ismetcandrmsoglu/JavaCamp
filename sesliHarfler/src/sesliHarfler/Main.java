package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='A';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf+ " kalýn seslidir");
			break;
		case 'E':
		case 'Ý':
		case 'Ö':
		case 'Ü':
			System.out.println(harf+ " ince seslidir");
			break;
		default: 
			System.out.println("GEÇERSÝZ DEÐER GÝRDÝNÝZ...");
		
		}

	}

}
