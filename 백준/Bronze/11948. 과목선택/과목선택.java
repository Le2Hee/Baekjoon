import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] min = {101, 101};
		int sum = 0;
		
		for (int i = 0; i < 6; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
			if (i < 4) {
				min[0] = Math.min(min[0], n);
			} else {
				min[1] = Math.min(min[1], n);
			}
		}
		
		int result = sum - min[0] - min[1];
		sb.append(result);
		System.out.println(sb);
	}
}