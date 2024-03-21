import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (!(s = br.readLine()).equals("0")) {
			BigInteger n = new BigInteger(s);
			
			if (n.remainder(BigInteger.valueOf(42)).equals(BigInteger.valueOf(0))) {
				sb.append("PREMIADO\n");
			} else {
				sb.append("TENTE NOVAMENTE\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}