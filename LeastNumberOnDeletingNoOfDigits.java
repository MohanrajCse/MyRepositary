import java.util.Arrays;
import java.util.Scanner;

public class LeastNumberOnDeletingNoOfDigits {

	public static void main(String[] args) {
		int k;
		int number;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number of digits to be removed: ");
			k = scanner.nextInt();
			System.out.println("Enter the number: ");
			number = scanner.nextInt();
			String string = "" + number;
			if (k < string.length() && k > 0) {
				char[] numberArray = string.toCharArray();
				Arrays.sort(numberArray);
				string = "";
				for (int i = 0; i < numberArray.length - k; i++) {
					string += numberArray[i];
				}
				System.out.println(Integer.parseInt(string));
			} else {
				System.out.println("Invalid Please enter correct details");
			}
		} catch (Exception exception) {
			System.out.println(exception);

		}
		scanner.close();
	}

}