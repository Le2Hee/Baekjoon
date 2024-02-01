import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		int[] gandalf = {1, 2, 3, 3, 4, 10};
		int[] sauron = {1, 2, 2, 2, 3, 5, 10};
		
		StringTokenizer st;
		
		for (int i = 1; i <= t; i++) {
			sb.append("Battle ").append(i).append(": ");
			int gsum = 0;
			int ssum = 0;
			
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 6; j++) {
				gsum += gandalf[j] * Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 7; j++) {
				ssum += sauron[j] * Integer.parseInt(st.nextToken());
			}
			
			if (gsum > ssum) {
				sb.append("Good triumphs over Evil").append("\n");
			} else if (gsum == ssum) {
				sb.append("No victor on this battle field").append("\n");
			} else {
				sb.append("Evil eradicates all trace of Good").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}