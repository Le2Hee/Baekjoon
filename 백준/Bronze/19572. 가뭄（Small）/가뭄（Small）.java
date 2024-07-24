import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		double d1 = Double.parseDouble(st.nextToken()); // a구역
		double d2 = Double.parseDouble(st.nextToken()); // b구역
		double d3 = Double.parseDouble(st.nextToken()); // c구역
		
		double a = (d1 + d2 - d3) / 2;
		double b = (d1 + d3 - d2) / 2;
		double c = (d2 + d3 - d1) / 2;
		
		if (a > 0 && b > 0 && c > 0) {
			sb.append(1).append("\n").append(a).append(" ").append(b).append(" ").append(c);
		} else {
			sb.append(-1);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}