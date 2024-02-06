import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(calcur(n, 0));
	}
	
	private static int calcur(int n, int count) {
		
		if (n < 2) {
			return count;
		}
		
		return Math.min(calcur(n / 2, count + 1 + (n % 2)), calcur(n / 3, count + 1 + (n % 3)));
	}
}
