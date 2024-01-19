import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer at = new StringTokenizer(br.readLine());
		StringTokenizer bt = new StringTokenizer(br.readLine());
		int as = 0;
		int bs = 0;
		
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(at.nextToken());
			int b = Integer.parseInt(bt.nextToken());
			
			if (a > b) {
				as++;
			} else if (b > a) {
				bs++;
			}
		}
		
		if (as > bs) {
			sb.append("A");
		} else if (as == bs) {
			sb.append("D");
		} else {
			sb.append("B");
		}
		
		System.out.println(sb);
	}
}