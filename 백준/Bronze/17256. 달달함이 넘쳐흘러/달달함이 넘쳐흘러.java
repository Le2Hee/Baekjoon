import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ax = Integer.parseInt(st.nextToken());
		int ay = Integer.parseInt(st.nextToken());
		int az = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int cx = Integer.parseInt(st.nextToken());
		int cy = Integer.parseInt(st.nextToken());
		int cz = Integer.parseInt(st.nextToken());
		
		sb.append(cx - az).append(" ").append(cy / ay).append(" ").append(cz - ax);
		System.out.println(sb);
	}
}