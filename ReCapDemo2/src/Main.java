
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0.0;
		double largestNumber = myList[0];
		for (double number : myList) {
			System.out.println(number);
			total += number;
			if (largestNumber < number) {
				largestNumber = number;
			} 

		}
		System.out.println("Sayýlarýn toplamý: " + total);
		System.out.println("en buyuk sayi: " + largestNumber);
	}

}
