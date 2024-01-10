import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		BigInteger[] bi = new BigInteger[n + 2];
		
		bi[0] = new BigInteger("0");
		bi[1] = new BigInteger("1");
		
		for (int i = 2; i < n + 2; i++) {
			bi[i] = bi[i - 1].add(bi[i - 2]);
		}
		
		sb.append(bi[n]);
		System.out.println(sb);
	}
}
