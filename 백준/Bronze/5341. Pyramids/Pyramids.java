import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		
		while (!(str = br.readLine()).equals("0")) {
			int n = Integer.parseInt(str);
			int sum = 0;
			
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}