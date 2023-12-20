import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[] ch = br.readLine().toCharArray();
		
		int b = 0;
		int s = 0;
		int a = 0;
		
		for (int i = 0; i < n; i++) {
			if (ch[i] == 'B') {
				b++;
			} else if (ch[i] == 'S') {
				s++;
			} else {
				a++;
			}
		}
		
		int max = Math.max(b, s);
		max = Math.max(max, a);
		
		if (b == max && s == max && a == max) {
			System.out.println("SCU");
		} else {
			if (b == max) {
				System.out.print('B');
			}
			
			if (s == max) {
				System.out.print('S');
			}
			
			if (a == max) {
				System.out.print('A');
			}
		}
	}
}