import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean[10];
		
		int n;
		for (int i = 0; i < 5; i++) {
			n = Integer.parseInt(br.readLine());
			check[n] = !check[n];
		}
		
		for (int i = 0; i < 10; i++) {
			if (check[i]) {
				System.out.println(i);
				break;
			}
		}
	}
}