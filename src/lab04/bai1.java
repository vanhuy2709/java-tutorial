package lab04;

public class bai1 {
	public static void main(String[] args) {
		Product test = new Product();

		Product pr1 = test.nhapThongTin("computer", 200, 0.1);
		test.xuatThongTin(pr1);
		System.out.println("Tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));

	}
}
