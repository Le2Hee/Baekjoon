import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = nums[0];
		int count = 1;
		
		for (int i = 1; i < n; i++) {
			if (start <= nums[i]) {
				count++;
				start = nums[i];
			} else {
				start = nums[i];
			}
		}
		
		System.out.println(count);
	}
}