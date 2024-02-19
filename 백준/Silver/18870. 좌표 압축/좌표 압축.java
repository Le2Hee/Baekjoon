import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[n];
		int[] sort = new int[n];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			nums[i] = num;
			sort[i] = num;
		}
		
		Arrays.sort(sort);
		HashMap<Integer, Integer> map = new LinkedHashMap<>();
		int count = 0;
		
		for (int m : sort) {
			if (!map.containsKey(m)) {
				map.put(m, count);
				count++;
			}
		}
		
		for (int m : nums) {
			sb.append(map.get(m)).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}