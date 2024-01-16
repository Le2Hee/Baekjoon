import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String str;
		
		for (int i = 1; i <= n; i++) {
			str = br.readLine();
			sb.append(i).append(". ").append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}