import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int h = 0;
		int m = 0;
		int s = 0;
		int count = 0;
		
		while (h <= n && m <= 59 && s <= 59) {
			if (h / 10 == k || h % 10 == k || m / 10 == k || m % 10 == k || s / 10 == k || s % 10 == k) {
				count++;
			}
			
			s++;
			if (s == 60) {
				m++;
				s = 0;
			}
			
			if (m == 60) {
				h++;
				m = 0;
			}
		}
		
		System.out.println(count);
	}
}