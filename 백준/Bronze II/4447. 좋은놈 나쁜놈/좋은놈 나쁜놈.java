import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		String s = "";
		int[] count;
		
		while (t-- > 0) {
			count = new int[2];
			
			s = br.readLine();
			sb.append(s).append(" is ");
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'g' || s.charAt(i) == 'G') {
					count[0]++;
				} else if (s.charAt(i) == 'b' || s.charAt(i) == 'B') {
					count[1]++;
				}
			}
			
			if (count[0] < count[1]) {
				sb.append("A BADDY\n");
			} else if (count[0] == count[1]) {
				sb.append("NEUTRAL\n");
			} else {
				sb.append("GOOD\n");
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}
