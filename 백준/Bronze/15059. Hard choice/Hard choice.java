import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int a3 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		int b3 = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		
		if (a1 < b1) {
			sum += b1 - a1;
		}
		
		if (a2 < b2) {
			sum += b2 - a2;
		}
		
		if (a3 < b3) {
			sum += b3 - a3;
		}
		
		System.out.println(sum);
	}
}