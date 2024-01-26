import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] member = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int[] count = new int[7];
			int max = 0;
			int num = 0;
			
			while (st.hasMoreElements()) {
				int index = Integer.parseInt(st.nextToken());
				count[index]++;
				max = Math.max(max, count[index]);
				if (max == count[index]) {
					num = index;
				}
			}
			
			if (max == 4) {
				member[i] = 50000 + num * 5000;
			} else if (max == 3) {
				member[i] = 10000 + num * 1000;
			} else if (max == 2) {
				for (int j = 1; j < 7; j++) {
					if (j != num && count[j] == 2) {
						member[i] = 2000 + num * 500 + j * 500;
						break;
					} else if (j != num && count[j] == 1) {
						member[i] = 1000 + num * 100;
						break;
					}
				}
			} else {
				for (int j = 6; j >= 1; j--) {
					if (count[j] == 1) {
						member[i] = j * 100;
						break;
					}
				}
			}
		}
		
		Arrays.sort(member);
		System.out.println(member[n - 1]);
	}
}