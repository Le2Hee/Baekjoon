import java.io.*;
import java.util.*;

public class Main {
	
	static int[] card;
	static int[] da = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2};
	static int[] db = {1, 1, 1, 2, 2, 3, 2, 2, 3, 3};
	static int[] dc = {2, 3, 4, 3, 4, 4, 3, 4, 4, 4};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			card = new int[5];
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 5; j++) {
				card[j] = Integer.parseInt(st.nextToken());
			}
			
			nums[i] = maxSearch();
			max = Math.max(max, nums[i]);
		}
		
		int result = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (max == nums[i]) {
				result = i + 1;
				break;
			}
		}
		
		System.out.println(result);
	}
	
	private static int maxSearch() {
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			result = Math.max(result, ((card[da[i]] + card[db[i]] + card[dc[i]]) % 10));
		}
		return result;
	}
}