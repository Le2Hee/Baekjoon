import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		StringBuffer sbf;
		
		while (n -- > 0) {
			sbf = new StringBuffer();
			sbf.append(br.readLine());
			sbf.reverse();
			sb.append(sbf.toString()).append("\n");
		}
		
		System.out.println(sb);
	}
}
