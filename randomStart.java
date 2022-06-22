package brightNetworkAmazonCoding;

import java.util.Random;

public class randomStart {
	public static void main (String[] args) {
		System.out.println(pickRandomDirection());
	}

	static int pickRandomDirection () {
		Random rand = new Random();
		int randomValue = rand.nextInt(6);
		return randomValue;
	}
}
