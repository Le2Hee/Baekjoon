import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 4;
		int sum = 0;
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
		}
		
		sb.append(sum / 60).append("\n").append(sum % 60);
		System.out.println(sb);
	}
}