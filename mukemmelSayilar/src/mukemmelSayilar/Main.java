package mukemmelSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 28;
		int count = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				count += i;
			}
		}
		if (count == number) {
			System.out.println("M�kemmel sayiyi buldunuz");
		} else {
			System.out.println("Malesef m�kemmel sayiyi bulamad�n�z");
		}
	}

}
