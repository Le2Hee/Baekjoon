import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 배달해야되는 설탕
		
		// 3, 5
		
		int num = n / 5;
		int result = 0;
		
		for (int i = 0; i <= num; i++) {
			
			if ((n - (5 * i)) % 3 == 0) {
				if (result != 0 && result > i + ((n - (5 * i)) / 3)) {
					result = i + ((n - (5 * i)) / 3);
				} else if (result == 0) {
					result = i + ((n - (5 * i)) / 3);
				}
			}
		}
		
		if (result != 0) {
			System.out.println(result);
		} else {
			System.out.println(-1);
		}
	}
}