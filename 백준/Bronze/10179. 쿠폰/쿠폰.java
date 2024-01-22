import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Double num;
		
		while (n-- > 0) {
			num = Double.valueOf(br.readLine());
			num /= 5;
			num *= 4;
			num = Math.round(num * 100) / 100.0;
			String s = String.format("%.2f", num);
			sb.append("$").append(s).append("\n");
		}
		
		System.out.println(sb);
	}
}