import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
	
	private static final int THRESHOLD = 1600;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();
		BigInteger result = BigInteger.ZERO;
		
		for (int i = 0; i < l; i++) {
			BigInteger n = BigInteger.valueOf(((int) str[i]) - 96);
			BigInteger num = BigInteger.valueOf(31).pow(i);
			
			result = result.add(n.multiply(num));
		}
		
		System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
    }
}