import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 순열의 길이
		
		Deque<Integer> qu = new LinkedList<>();
		boolean check = false;
		
		for (int i = n; i >= 1; i--) {
			if (!check) {
				qu.addLast(i);
			} else {
				qu.addFirst(i);
			}
			
			check = !check;
		}
		
		while (!qu.isEmpty()) {
			sb.append(qu.poll()).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}