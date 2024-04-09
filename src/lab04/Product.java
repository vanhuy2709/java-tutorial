package lab04;

public class Product {
	private String name;
	private double price;
	private double tax;

//	Constructor
	public Product() {
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

//	Getter / Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

//	Nhap thong tin
	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

//	Xuat thong tin
	public void xuatThongTin(Product pr) {
		System.out.println("Tên sản phẩm: " + pr.getName());
		System.out.println("Giá sản phẩm: " + pr.getPrice());
		System.out.println("Thuế sản phẩm: " + pr.getTax());
	}

//	Get Tax Price
	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
