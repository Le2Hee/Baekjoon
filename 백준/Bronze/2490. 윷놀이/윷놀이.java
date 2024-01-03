import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 3;
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int m = 4;
			int[] nums = new int[2];
			
			while (m-- > 0) {
				nums[Integer.parseInt(st.nextToken())]++;
			}
			
			if (nums[0] == 1 && nums[1] == 3) {
				System.out.println("A");
			} else if (nums[0] == 2 && nums[1] == 2) {
				System.out.println("B");
			} else if (nums[0] == 3 && nums[1] == 1) {
				System.out.println("C");
			} else if (nums[0] == 4) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		}
	}
}