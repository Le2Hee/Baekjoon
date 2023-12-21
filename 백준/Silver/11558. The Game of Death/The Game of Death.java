import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 숫자
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine()); // 사람 수, 주경이 번호
			int[] nums = new int[n + 1];
			
			for (int j = 1; j <= n; j++) {
				nums[j] = Integer.parseInt(br.readLine());
			}
			
			int index = 1;
			int count = 0;
			
			while (index != n) {
				index = nums[index];
				count++;
				
				if (count > n) {
					count = 0;
					break;
				}
			}
			
			System.out.println(count);
		}
	}
}