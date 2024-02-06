import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		for (int i = 1; i <= 6; i++) {
			char c = br.readLine().charAt(0);
			
			if (c == 'W') {
				count++;
			}
		}
		
		if (count >= 5) {
			System.out.println(1);
		} else if (count >= 3) {
			System.out.println(2);
		} else if (count >= 1) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}
	}
}