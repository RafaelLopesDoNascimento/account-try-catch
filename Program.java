package Exercise178;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double balance, withdrawLimit, value;
		String holder;
		Integer number;
		System.out.println("Enter account data");
		System.out.println("Number:");
		try {
			number = sc.nextInt();
			System.out.println("Holder:");
			holder = sc.next();
			System.out.println("Initial balance:");
			balance = sc.nextDouble();
			System.out.println("Withdraw limit:");
			withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println("Enter amount for withdraw:");
			
			value = sc.nextDouble();
			account.Withdraw(value);
		} catch (InputMismatchException e) {
			System.out.println("You have entered invalid charracters");
		}
		
		
		
	}

}
