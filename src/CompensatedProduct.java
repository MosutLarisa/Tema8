
public class CompensatedProduct extends Product {
	
	private double coef;

	public CompensatedProduct(int code, String name, double basePrice, int quantity, double coef) {
		super(code, name, basePrice, quantity);
		this.coef = coef;
	}
	
	public double getCoef() {
		return coef;
	}
	
	public double getPrice() {
		return getBasePrice() * coef;
	}

}
