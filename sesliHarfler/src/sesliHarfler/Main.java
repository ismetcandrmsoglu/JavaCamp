package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='A';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf+ " kal�n seslidir");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println(harf+ " ince seslidir");
			break;
		default: 
			System.out.println("GE�ERS�Z DE�ER G�RD�N�Z...");
		
		}

	}

}
