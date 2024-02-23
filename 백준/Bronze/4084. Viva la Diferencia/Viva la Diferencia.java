import java.io.*;
import java.util.*;

public class Main {
	
	static int[] nums;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0 0 0 0")) {
			st = new StringTokenizer(s);
			count = 0;
			nums = new int[4];
			for (int i = 0; i < 4; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			if (!(nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[3])) {
				func();
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void func() {
		count++;
		int num1 = Math.abs(nums[0] - nums[1]);
		int num2 = Math.abs(nums[1] - nums[2]);
		int num3 = Math.abs(nums[2] - nums[3]);
		int num4 = Math.abs(nums[3] - nums[0]);
		
		if (!(num1 == num2 && num2 == num3 && num3 == num4)) {
			nums[0] = num1;
			nums[1] = num2;
			nums[2] = num3;
			nums[3] = num4;
			func();
		}
	}
}