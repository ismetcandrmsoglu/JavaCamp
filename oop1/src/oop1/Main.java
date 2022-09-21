package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setUnitInStock(4);
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setUnitInStock(4);
		product2.setDiscount(7);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();
		product3.setName("Samsung Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setUnitInStock(4);
		product3.setDiscount(7);
		product3.setImageUrl("bilmemne2.jpg");
		
		
		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName() + " fiyatý: " + product.getUnitPrice());
		}
		
		
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setFirstName("Berna");
		individualCustomer.setLastName("Özgen");
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("123456789");
		individualCustomer.setPhone("05000000000");
		
		ComporateCustomer comporateCustomer=new ComporateCustomer();
		comporateCustomer.setId(2);
		comporateCustomer.setCompanyName("Kodlama.io");
		comporateCustomer.setPhone("05524567898");
		comporateCustomer.setTaxNumber("1111111111111");
		comporateCustomer.setCustomerNumber("54321");
		
		
		
		Customer[] customers=  {individualCustomer,comporateCustomer};
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}

	}

}
