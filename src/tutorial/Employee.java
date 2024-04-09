package tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Double> arrNumber = new ArrayList<Double>();

		while (true) {
			System.out.println("Nhập vào một số thực bất kỳ: ");
			double input = sc.nextDouble();
			arrNumber.add(input);

			sc.nextLine(); // enter

			System.out.println("Continue ? Y or N ???");
			String option = sc.nextLine();

			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}

		System.out.println("Check array: " + arrNumber);
		double sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}

		System.out.println("Sum array: " + sum);
	}
}