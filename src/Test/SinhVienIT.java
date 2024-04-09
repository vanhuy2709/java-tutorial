package Test;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String language, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.language = language;
	}

	public void getMoney() {
		System.out.println("Get money");
		super.info();
	}

	public void info() {

	}
}
