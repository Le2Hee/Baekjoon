import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		int t;
		char[] str;
		while (!(s = br.readLine()).equals("0")) {
			t = Integer.parseInt(s);
			int now = 0;
			int max = 0;
			
			while (t-- > 0) {
				str = br.readLine().toCharArray();
				max = Math.max(max, str.length);
				boolean check = false;
				
				if (str.length > now) {
					for (int i = now; i < str.length; i++) {
						if (str[i] == ' ') {
							check = true;
							now = i;
							break;
						}
					}
				}
				
				if (!check && str.length > now) {
					now = str.length;
				}
			}
			
			if (now == 0) {
				now = max;
			}
			
			sb.append(now + 1).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
