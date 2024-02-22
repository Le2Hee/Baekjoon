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
			String name = st.nextToken();
			int s = Integer.parseInt(st.nextToken());
			
			sb.append(name).append(" ");
			
			if (100 >= s && s >= 97) {
				sb.append("A+\n");
			} else if (96 >= s && s >= 90) {
				sb.append("A\n");
			} else if (89 >= s && s >= 87) {
				sb.append("B+\n");
			} else if (86 >= s && s >= 80) {
				sb.append("B\n");
			} else if (79 >= s && s >= 77) {
				sb.append("C+\n");
			} else if (76 >= s && s >= 70) {
				sb.append("C\n");
			} else if (69 >= s && s >= 67) {
				sb.append("D+\n");
			} else if (66 >= s && s >= 60) {
				sb.append("D\n");
			} else {
				sb.append("F\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}