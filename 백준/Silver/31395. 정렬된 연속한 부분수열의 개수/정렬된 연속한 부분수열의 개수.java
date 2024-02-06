import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			s.push(Integer.parseInt(st.nextToken()));
		}
		
		long result = 0;
		long stack = 1;
		int num = s.pop();
		
		while (!s.isEmpty()) {
			int m = s.pop();
			
			if (m > num) {
				result += stack;
				stack = 1;
			} else {
				result += stack;
				stack++;
			}
			
			num = m;
		}
		
		result += stack;
		System.out.println(result);
	}
}