import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count0 = 0;
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreElements()) {
			int m = Integer.parseInt(st.nextToken());
			sum += m;
			if (m == 0) {
				count0++;
			}
		}
		
		if (n % 2 == 0 && n / 2 <= count0) {
			System.out.println("INVALID");
		} else if (n % 2 == 1 && n / 2 + 1 <= count0) {
			System.out.println("INVALID");
		} else {
			if (sum <= 0) {
				System.out.println("REJECTED");
			} else {
				System.out.println("APPROVED");
			}
		}
	}
}