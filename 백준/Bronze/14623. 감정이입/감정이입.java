import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(br.readLine(), 2);
		BigInteger b = new BigInteger(br.readLine(), 2);
		a = a.multiply(b);
		System.out.println(a.toString(2));
	}
}