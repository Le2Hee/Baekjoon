import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] sum = new int[10];
		int n = Integer.parseInt(br.readLine());
		sum[0] = n;
		for (int i = 1; i < 10; i++) {
			n = Integer.parseInt(br.readLine());
			sum[i] = sum[i - 1] + n;
		}
		
		if (sum[0] >= 100) {
			sb.append(sum[0]);
		} else {
			for (int i = 1; i < 10; i++) {
				if (sum[i] >= 100) {
					if (100 - sum[i - 1] >= sum[i] - 100) {
						sb.append(sum[i]);
						break;
					} else {
						sb.append(sum[i - 1]);
						break;
					}
				}
			}
		}
		
		if (sb.length() == 0) {
			sb.append(sum[9]);
		}
		
		System.out.println(sb);
	}
}