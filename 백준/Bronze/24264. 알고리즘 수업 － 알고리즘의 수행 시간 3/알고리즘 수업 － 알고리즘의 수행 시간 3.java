import java.io.*;
import java.util.*;

public class Main {
	
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long n = Integer.parseInt(br.readLine());
		sb.append(n * n).append("\n").append(2);
		System.out.println(sb);
	}
}