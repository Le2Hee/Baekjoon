import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Set<Integer> set = new LinkedHashSet<>();
		long sum = 0;
		
		while (m-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			
			for (int i = num; i <= n; i += num) {
				set.add(i);
			}
		}
		
		for (int num : set) {
			sum += num;
		}
		
		System.out.println(sum);
	}
}