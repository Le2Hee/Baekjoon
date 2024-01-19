import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(st.nextToken(), 2);
		BigInteger b = new BigInteger(st.nextToken(), 2);
		a = a.add(b);
		String result = a.toString(2);
		System.out.println(result);
	}
}