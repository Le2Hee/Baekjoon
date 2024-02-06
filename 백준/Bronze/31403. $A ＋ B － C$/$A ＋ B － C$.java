import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a = br.readLine();
		String b = br.readLine();
		int c = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(a) + Integer.parseInt(b) - c;
		sb.append(num).append("\n");
		num = Integer.parseInt(a + b) - c;
		sb.append(num);
		System.out.println(sb);
	}
}