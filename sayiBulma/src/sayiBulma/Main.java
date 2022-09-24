package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int wanted = 6;
		
	for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==wanted) {
				System.out.println("aranan sayý "+(i+1)+". eleman");
			}
			else {
				System.out.println("aranan sayý mevcut deðil");
				break;
			}
		}
   
    
	}

}
