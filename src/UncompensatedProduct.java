
public class UncompensatedProduct extends Product {
	
    public UncompensatedProduct(int code, String name, double basePrice, int quantity) {
        super(code, name, basePrice, quantity);
    }
    
    public double getPrice() {
    	return getBasePrice();
    }

}
