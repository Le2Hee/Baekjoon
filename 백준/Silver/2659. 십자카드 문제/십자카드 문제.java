import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		visit = new boolean[10000];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int min = minSearch(a, b, c, d);
		
		int count = 0;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10; k++) {
					for (int l = 1; l < 10; l++) {
						minSearch(i, j, k, l);
					}
				}
			}
		}
		
		for (int i = 1111; i < 10000; i++) {
			if (visit[i]) {
				count++;
				if (i == min) {
					break;
				}
			}
		}
		
		System.out.println(count);
	}
	
	private static int minSearch(int a, int b, int c, int d) {
		int min = a * 1000 + b * 100 + c * 10 + d;
		min = Math.min(min, b * 1000 + c * 100 + d * 10 + a);
		min = Math.min(min, c * 1000 + d * 100 + a * 10 + b);
		min = Math.min(min, d * 1000 + a * 100 + b * 10 + c);
		visit[min] = true;
		
		return min;
	}
}