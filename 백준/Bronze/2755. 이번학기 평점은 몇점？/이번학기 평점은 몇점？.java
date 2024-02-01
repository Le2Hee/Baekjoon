import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		double sum = 0;
		double num = 0;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			num += a;
			
			if (s.equals("A+")) {
				sum += a * 4.3;
			} else if (s.equals("A0")) {
				sum += a * 4.0;
			} else if (s.equals("A-")) {
				sum += a * 3.7;
			} else if (s.equals("B+")) {
				sum += a * 3.3;
			} else if (s.equals("B0")) {
				sum += a * 3.0;
			} else if (s.equals("B-")) {
				sum += a * 2.7;
			} else if (s.equals("C+")) {
				sum += a * 2.3;
			} else if (s.equals("C0")) {
				sum += a * 2.0;
			} else if (s.equals("C-")) {
				sum += a * 1.7;
			} else if (s.equals("D+")) {
				sum += a * 1.3;
			} else if (s.equals("D0")) {
				sum += a * 1.0;
			} else if (s.equals("D-")) {
				sum += a * 0.7;
			}
		}
		
		double result = sum / num;
		String format = String.format("%.2f", result);
		System.out.println(format);
	}
}