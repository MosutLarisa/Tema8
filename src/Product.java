
public class Product {
	
	private int code;
	private String name;
	private double basePrice;
	private int quantity;
	
	public Product(int code, String name, double basePrice, int quantity) {
		super();
		this.code = code;
		this.name = name;
		this.basePrice = basePrice;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getBasePrice() {
		return basePrice;
	}
	
	public double getPrice() {
		return basePrice;
	}
	
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }
	

}
