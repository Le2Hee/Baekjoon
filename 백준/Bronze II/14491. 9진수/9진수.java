import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger num = new BigInteger(br.readLine());
		bw.write(num.toString(9));
        bw.flush();
        bw.close();
        br.close();
	}
}