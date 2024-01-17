import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 1;
		int sum = 0;
		
		while (n-- > 0) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 1) {
				sum += count;
				count++;
			} else {
				count = 1;
			}
		}
		
		sb.append(sum);
		System.out.println(sb);
	}
}