import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int u = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		if (b >= 1000) {
			if (u >= 8000 || l >= 260) {
				sb.append("Very Good");
			} else {
				sb.append("Good");
			}
		} else {
			sb.append("Bad");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
