package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
	     System.out.println("--------------------");
	     
        //VALUE TYPE
		int say1 = 10;
		int say2 = 20;
		say2 = say1;
		say1 = 30;
		System.out.println(say1);
		System.out.println(say2);
        System.out.println("--------------------");
        
		//REFERANCE TYPE
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}
