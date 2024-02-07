import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (!(s = br.readLine()).equals("0")) {
			int n = Integer.parseInt(s);
			
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}