
public class Main {

	public static void main(String[] args) {

		Warehouse warehouse = new Warehouse();
		CompensatedProduct cp = new CompensatedProduct(1, "Produs1", 200, 5, 3);
		UncompensatedProduct up = new UncompensatedProduct(2, "Produs2", 150, 50);
		
		warehouse.addProduct(cp);
		warehouse.addProduct(up);
		warehouse.addProduct(up);
		warehouse.addProduct(cp);

		
		warehouse.printInventory();
	}

}
