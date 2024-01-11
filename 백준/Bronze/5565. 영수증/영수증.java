import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int sum = Integer.parseInt(br.readLine());
		int n =9;
		
		while (n-- > 0) {
			int m = Integer.parseInt(br.readLine());
			sum -= m;
		}
		
		sb.append(sum);
		System.out.println(sum);
	}
}