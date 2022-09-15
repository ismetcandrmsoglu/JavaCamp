package introo;

public class Main {
//14.09.2022 Engin Demiroð ilk Ders
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Hello World!");
      
      
      String ortaMetin="Ýlginizi Çekebilir";
      String altMetin="Vade Süresi";
      
      
      System.out.println(ortaMetin);
      System.out.println(altMetin);
      
      
      int vade=12;
      double dolarDun=18.10;
      double dolarBugun=18.10;
      
      boolean dolarDustuMu=false;
      
      
      String okYonu="";
    if (dolarDun<dolarBugun) {
    	okYonu="down.svg";
		System.out.println(okYonu);
	}else if(dolarDun==dolarBugun){
		okYonu="equal.svg";
		System.out.println(okYonu);
	}
    else {
       okYonu="up.svg";
       System.out.println(okYonu);
	}
      
      
      
    String[] krediler= {"Hýzlý kredi","Maaþýný Halkbanktan Alan","Mutlu Müþteri"};
      
     for(String kredi : krediler) {
 		System.out.println(kredi);
	} 
	}  
	

}
