package in.NumberProblems;

public class Num16Armstrong {

	// armstrong number
	// sum of the digits that are raised to power with the total number of digits

	public static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static int pow(int base, int exp) {
		int prod = 1;
		for (int i = 0; i < exp; i++) {
			prod = prod * base;
		}
		return prod;
	}

	public static boolean isArmstrong(int num) {
		int exp = countDigit(num);
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int mod = num % 10;
			sum = sum + pow(mod, exp);
			num = num / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
