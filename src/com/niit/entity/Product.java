rpackage com.niit.entity;

public class Product {
	private int product_id;
	private int category_id;
	private int supplier_id;
	private String name;
	private String description;
	private double unit_price;
	private int quantity;

	public int getProductId() {
		return this.product_id;
	}

	public void setProductId(int product_id) {
		this.product_id = product_id;
	}

	public int getCategoryId() {
		return this.category_id;
	}

	public void setCategoryId(int category_id) {
		this.category_id = category_id;
	}

	public int getSupplierId() {
		return this.supplier_id;
	}

	public void setSupplierId(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String discription) {
		this.description = description;
	}

	public double getUnitPrice() {
		return this.unit_price;
	}

	public void setUnitPrice(int unit_price) {
		this.unit_price = unit_price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
