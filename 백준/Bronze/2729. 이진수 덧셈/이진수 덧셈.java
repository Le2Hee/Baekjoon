import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			BigInteger a = new BigInteger(st.nextToken(), 2);
			BigInteger b = new BigInteger(st.nextToken(), 2);
			a = a.add(b);
			sb.append(a.toString(2)).append("\n");
		}
		
		System.out.println(sb);
	}
}