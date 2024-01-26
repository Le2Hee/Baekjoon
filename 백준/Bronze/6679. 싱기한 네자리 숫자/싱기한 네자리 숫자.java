import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 2992; i <= 9999; i++) {
			if (check(i)) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	private static boolean check(int n) {
		boolean bo = false;
		
		int a = 0;
		for (int i = n; i > 0; i /= 10) {
			a += i % 10;
		}
		
		int b = 0;
		for (int i = n; i > 0; i /= 12) {
			b += i % 12;
		}
		
		int c = 0;
		for (int i = n; i > 0; i /= 16) {
			c += i % 16;
		}
		
		if (a == b && b == c) {
			bo = !bo;
		}
		
		return bo;
	}
}