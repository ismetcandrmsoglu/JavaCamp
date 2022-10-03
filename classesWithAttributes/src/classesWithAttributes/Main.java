package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();

		product.setId(100);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.printf("urunun kodu: " + product.getKod());
		System.out.printf("\t urunun Adi: " +product.getName());
		System.out.printf("\turunun açýklamasý: " + product.getDescription());
		System.out.println("\nurunun fiyatý: " + product.getPrice());
		System.out.println("urunun stok: " + product.getStockAmount());

	}

}
