import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int w = 1;
		int h = 1;
		
		for (int i = 1; i <= n; i++) {
			if (w == h) {
				w++;
			} else {
				h++;
			}
		}
		
		int result = w * h;
		System.out.println(result);
	}
}