import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<int[]> list = new LinkedList<>();
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int[] nums = {num, g, s, b};
			list.add(nums);
		}
		
		list.sort(Comparator.comparingInt((int[] a) -> a[1]).reversed().thenComparingInt(a -> a[3]).reversed().thenComparingInt(a -> a[2]).reversed());
		int index = 0;
		
		for (int i = 0; i < n; i++) {
			if (list.get(i)[0] == k) {
				index = i;
			}
		}
		
		for (int i = index - 1; i >= 0; i--) {
			if (list.get(index)[1] == list.get(i)[1] && list.get(index)[2] == list.get(i)[2] && list.get(index)[3] == list.get(i)[3]) {
				count++;
			}
		}
		
		System.out.println(index + 1 - count);
	}
}