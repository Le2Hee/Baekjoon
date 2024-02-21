import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			boolean pCase = st.nextToken().equals("C") ? true : false;
			
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreElements()) {
				if (pCase) {
					int n = st.nextToken().charAt(0) - 'A' + 1;
					sb.append(n).append(" ");
				} else {
					char c = (char)(Integer.parseInt(st.nextToken()) - 1 + 'A');
					sb.append(c).append(" ");
				}
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}