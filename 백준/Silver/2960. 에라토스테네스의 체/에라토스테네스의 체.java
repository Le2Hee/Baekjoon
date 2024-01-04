import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer> numbers;
	static int n, k;
	static int count = 0;
	static int result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		numbers = new LinkedList<Integer>();
		
		for (int i = 2; i <= n; i++) {
			numbers.add(i);
		}
		
		remove();
		
		System.out.println(result);
	}
	
	private static void remove() {
		int min = numbers.get(0);
		count++;
		if (count == k) {
			result = min;
		} else {
			numbers.remove(0);
			
			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) % min == 0) {
					count++;
					if (count == k) {
						result = numbers.get(i);
						break;
					}
					numbers.remove(i);
				}
			}
			
			if (count < k) {
				remove();
			}
		}
	}
}