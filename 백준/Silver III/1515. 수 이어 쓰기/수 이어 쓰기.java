import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		Deque<Character> q = new LinkedList<>();
		
		for (int i = 0; i < s.length(); i++) {
			q.addLast(s.charAt(i));
		}
		
		char c = q.pollFirst();
		
		for (int i = 1; ; i++) {
			s = String.valueOf(i);
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == c) {
					if (!q.isEmpty()) {
						c = q.pollFirst(); 
					} else {
						sb.append(i);
						break;
					}
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}