import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> nums = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		int count = 0;
		
		if (n == 1) {
			count = nums.get(0);
			if (count > 1440) {
				System.out.println(-1);
			} else {
				System.out.println(count);
			}
		} else {
			while (nums.size() > 0) {
				Collections.sort(nums, Collections.reverseOrder());
				
				if (nums.size() != 1) {
					count++;
					
					int z = nums.get(0) - 1;
					int o = nums.get(1) - 1;
					
					if (o == 0) {
						nums.remove(1);
					} else {
						nums.set(1, o);
					}
					
					if (z == 0) {
						nums.remove(0);
					} else {
						nums.set(0, z);
					}
				} else {
					count += nums.get(0);
					break;
				}
			}
			
			if (count > 1440) {
				count = -1;
			}
			
			System.out.println(count);
		}
	}
}