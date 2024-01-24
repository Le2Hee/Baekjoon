import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		List<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num % 2 == 0) {
				sum += num;
			} else {
				list.add(num);
			}
		}
		
		Collections.sort(list);
		
		if (list.size() % 2 == 0) {
			for (int m : list) {
				sum += m;
			}
		} else {
			for (int i = 1; i < list.size(); i++) {
				sum += list.get(i);
			}
		}
		
		System.out.println(sum);
	}
}
