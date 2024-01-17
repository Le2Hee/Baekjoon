import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] w = new int[10];
		int[] k = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			w[i] = num;
		}
		
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			k[i] = num;
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		
		int wsum = w[9] + w[8] + w[7];
		int ksum = k[9] + k[8] + k[7];
		
		sb.append(wsum).append(" ").append(ksum);
		System.out.println(sb);
	}
}