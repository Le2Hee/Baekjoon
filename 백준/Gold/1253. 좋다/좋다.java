import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		int count = 0, r, l, m;
		for (int i = 0; i < n; i++) {
			m = nums[i];
			l = 0;
			r = n - 1;
			
			while (l < r) {
				if (l == i) {
					l++;
					continue;
				} else if (r == i) {
					r--;
					continue;
				}
				
				if (nums[l] + nums[r] == m) {
					count++;
					break;
				} else if (nums[l] + nums[r] > m) {
					r--;
				} else {
					l++;
				}
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}