import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num;
		int count = n;
		
		for (int i = 1; i <= n; i++) {
			num = Integer.parseInt(st.nextToken());
			
			if (i == num) {
				count--;
			}
		}
		
		System.out.println(count);
	}
}