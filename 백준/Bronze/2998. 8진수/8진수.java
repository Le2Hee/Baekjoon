import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(br.readLine(), 2);
		System.out.println(n.toString(8));
	}
}