import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<Integer>();
		list.add(0);
		int count = 0;
		
		for (int i = 1; ; i++) {
			list.add(i + list.get(i - 1));
			
			if (list.get(i) > n) {
				count = i - 1;
				n -= list.get(i - 1);
				break;
			}
		}
		
		for (int i = 1; ; i++) {
			if (list.get(i) > n) {
				n -= list.get(i - 1);
				count += i - 1;
				if (n == 0) {
					break;
				} else {
					i = 0;
				}
			}
			
		}
		
		sb.append(count);
		System.out.println(sb);
	}
}