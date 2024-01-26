import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		StringTokenizer st;
		int count, min, max;
		int[] nums;
		
		while (!(str = br.readLine()).equals("-1")) {
			st = new StringTokenizer(str);
			count = 0;
			min = 101;
			max = -1;
			nums = new int[101];
			
			while (st.hasMoreElements()) {
				int num = Integer.parseInt(st.nextToken());
				if (num != 0) {
					nums[num]++;
					min = Math.min(min, num);
					max = Math.max(max, num);
				}
			}
			
			for (int i = min; i <= max; i++) {
				if (nums[i] == 1 && i % 2 == 0 && nums[i / 2] == 1) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}