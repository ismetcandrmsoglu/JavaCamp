
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number=59;
       int count=0;
       if(number<1) {
    	   System.out.println("Ge�ersiz say� girdiniz...");
    	   return;
       }          
       for(int i=1;i<= number;i++) {
    	   if (number%i==0) {
			count++;
		}
       }
       if(count==2) {
    	   System.out.println("sayi asald�r");
       }
       else {
    	   System.out.println("sayi asal de�ildir");
       }
     
       
	}

}
