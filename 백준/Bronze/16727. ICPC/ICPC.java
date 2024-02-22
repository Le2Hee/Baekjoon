import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1 = Integer.parseInt(st.nextToken());
		int e1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int e2 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		
		bw.write(p1 + p2 == e1 + e2 ? e1 == p2 ? "Penalty" : e1 > p2 ? "Esteghlal" : "Persepolis" : p1 + p2 > e1 + e2 ? "Persepolis" : "Esteghlal");
		bw.flush();
		bw.close();
		br.close();
	}
}
