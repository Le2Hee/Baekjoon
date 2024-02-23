import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] arr = br.readLine().toCharArray();
		
		int now = 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i] - 'A' + 1;
			int a = 0, b = 0;
			
			if (now < n) {
				a = n - now;
				b = 26 - n + now;
			} else if (now > n) {
				a = 26 - now + n;
				b = now - n;
			}
			
			sum += Math.min(a, b);
			now = n;
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
