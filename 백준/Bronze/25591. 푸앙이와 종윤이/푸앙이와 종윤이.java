import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int a = 100 - n;
		int b = 100 - m;
		int c = 100 - (a + b);
		int d = a * b;
		int q = d / 100;
		int r = d % 100;
		
		sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(q).append(" ").append(r).append(" ").append("\n").append(c + q).append(" ").append(r);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}