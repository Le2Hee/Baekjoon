import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int max = Math.max(x, y);
		int result = Integer.MAX_VALUE;
		int sum;
		
		for (int i = 0; i <= max; i++) {
			sum = 0;
			
			if (x > i) {
				sum += (x - i) * a;
			}
			
			if (y > i) {
				sum += (y - i) * b;
			}
			
			sum += i * c * 2;
			result = Math.min(result, sum);
		}
		
		System.out.println(result);
	}
}
