import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 0 -> 48
		
		String str = br.readLine();
		int[] numbers = new int[9];
		int max = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '9' || str.charAt(i) == '6') {
				numbers[6]++;
				max = Math.max(max, (int) Math.round(numbers[6] / 2.0));
			} else {
				numbers[((int) str.charAt(i)) - 48]++;
				max = Math.max(max, numbers[str.charAt(i) - 48]);
			}
		}
		
		System.out.println(max);
	}
}