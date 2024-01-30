import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int num = 1;
		
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(st.nextToken());
			if (m == num) {
				num++;
			} else {
				count++;
			}
		}
		
		System.out.println(count);
	}
}