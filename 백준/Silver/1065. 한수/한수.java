import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int count = 99;

		if (n < 100) {
			System.out.println(n);
		} else if (100 <= n && n < 111) {
			System.out.println(count);
		} else if (n == 1000) {
			System.out.println(144);
		} else {
			for (int i = 111; i <= n; i++) {
				int num1 = i / 100;
				int num2 = (i % 100) / 10;
				int num3 = i % 10;
				
				if (num1 - num2 == num2 - num3) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}