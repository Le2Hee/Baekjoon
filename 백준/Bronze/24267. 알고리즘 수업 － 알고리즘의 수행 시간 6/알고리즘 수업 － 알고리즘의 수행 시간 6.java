import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long n = Integer.parseInt(br.readLine());
		sb.append((n * (n - 1) * (n - 2)) / 6).append("\n").append(3);
		System.out.println(sb);
	}
}