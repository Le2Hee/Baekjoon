import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		result = 1;
		if (n != 1) {
			search();
		}
		System.out.println(result);
	}
	
	private static void search() {
		result++;
		
		if (n % 2 == 0) {
			n /= 2;
			
			if (n == 1) {
				return;
			} else {
				search();
			}
		} else {
			n = 3 * n + 1;
			search();
		}
	}
}