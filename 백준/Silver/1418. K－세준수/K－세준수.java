import java.io.*;
import java.util.*;

public class Main {
	
	static int k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		int count = 1;
		
		for (int i = 2; i <= max; i++) {
			if (search(i)) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean search(int n) {
		boolean result = false;
		int num = n;
		
		for (int i = 2; ; i++) {
			if (num % i == 0 && i <= k) {
				num /= i;
				i = 1;
				
				if (num == 1) {
					result = true;
					break;
				}
			} else if (i > k) {
				break;
			}
		}
		
		return result;
	}
}