import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int c = 0;
		
		for (int i = 1; i <= 50; i++) {
			int m = Integer.parseInt(st.nextToken());
			if (n == m) {
				c = i;
				break;
			}
		}
		
		if (1 <= c && c <= 5) {
			sb.append("A+");
		} else if (6 <= c && c <= 15) {
			sb.append("A0");
		} else if (16 <= c && c <= 30) {
			sb.append("B+");
		} else if (31 <= c && c <= 35) {
			sb.append("B0");
		} else if (36 <= c && c <= 45) {
			sb.append("C+");
		} else if (46 <= c && c <= 48) {
			sb.append("C0");
		} else {
			sb.append("F");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}