import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0")) {
			st = new StringTokenizer(s);
			int t = Integer.parseInt(st.nextToken());
			int sub = Integer.parseInt(st.nextToken());
			t--;
			sb.append(sub).append(" ");
			
			while (t-- > 0) {
				int num = Integer.parseInt(st.nextToken());
				if (num != sub) {
					sb.append(num).append(" ");
				}
				sub = num;
			}
			
			sb.append("$\n");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}