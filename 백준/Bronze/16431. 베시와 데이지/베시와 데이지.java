import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int by = Integer.parseInt(st.nextToken());
		int bx = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int dy = Integer.parseInt(st.nextToken());
		int dx = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int jy = Integer.parseInt(st.nextToken());
		int jx = Integer.parseInt(st.nextToken());
		
		int bcount = Math.abs(jy - by) + Math.abs(jx - bx);
		int dcount = Math.abs(jy - dy) + Math.abs(jx - dx);
		
		int sum = Math.min(Math.abs(jy - by), Math.abs(jx - bx));
		bcount -= sum;
		
		if (bcount > dcount) {
			sb.append("daisy");
		} else if (bcount == dcount) {
			sb.append("tie");
		} else {
			sb.append("bessie");
		}
		
		System.out.println(sb);
	}
}