import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = {
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken())
		};
		
		Arrays.sort(nums);
		
		if (nums[0] == nums[1] || nums[1] == nums[2] || nums[2] == nums[1]) {
			sb.append("S");
		} else if (nums[2] == nums[0] + nums[1]) {
			sb.append("S");
		} else {
			sb.append("N");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}