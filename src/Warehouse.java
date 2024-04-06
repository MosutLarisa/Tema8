import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	
	private List<Product> products;
	
	public Warehouse() {
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
	    boolean productExists = false;
	    for (Product p : products) {
	        if (p.getCode() == product.getCode()) {
	            p.updateQuantity(product.getQuantity()+1);
	            productExists = true;
	            break;
	        }
	    }
	    if (!productExists) {
	        products.add(product);
	    }
	}
    
    public void printInventory() {
        for (Product p : products) {
            System.out.println("Code: " + p.getCode() + ", Name: " + p.getName() + ", Price: " + p.getPrice() + ", Quantity: " + p.getQuantity());
        }
    }
}
