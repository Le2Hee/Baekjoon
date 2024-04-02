import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		Stack<Integer> qu = new Stack<>();
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			qu.add(n);
		}
		
		int now = qu.pop(), sub, count = 0;
		while (!qu.isEmpty()) {
			sub = qu.pop();
			
			if (now > sub) {
				now = sub;
			} else {
				count += sub - now + 1;
				now--;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}