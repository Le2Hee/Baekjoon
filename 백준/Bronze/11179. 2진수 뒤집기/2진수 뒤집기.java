import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder(Integer.toBinaryString(Integer.parseInt(br.readLine())));
		s.reverse();
		BigInteger result = new BigInteger(s.toString(), 2);
		System.out.println(result);
	}
}