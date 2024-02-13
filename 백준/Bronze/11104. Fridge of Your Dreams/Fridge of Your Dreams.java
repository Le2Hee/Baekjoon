import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			BigInteger n = new BigInteger(br.readLine(), 2);
			sb.append(n).append("\n");
		}
		
		System.out.println(sb);
	}
}