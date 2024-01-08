import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visit;
	static int n, count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		visit = new boolean[1001];
		count = 0;
		result();
		System.out.println(count);
	}
	
	private static void result() {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				for (int k = 0; k <= n - i - j; k++) {
					int num = n - i - j - k;
					int sum = 1 * i + 5 * j + 10 * k + 50 * num;
					if (!visit[sum]) {
						visit[sum] = true;
						count++;
					}
				}
			}
		}
	}
}