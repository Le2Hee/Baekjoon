import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		BigInteger num = new BigInteger(str);
		
		bw.write(sqrt(num).toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
    private static BigInteger sqrt(BigInteger x) {
        BigInteger estimation = BigInteger.ZERO.setBit(x.bitLength() / 2);
        BigInteger subEstimation = estimation;
        
        while (true) {
            BigInteger tmp = estimation.add(x.divide(estimation)).shiftRight(1);
            if (tmp.equals(estimation) || tmp.equals(subEstimation))
                return tmp;
            subEstimation = estimation;
            estimation = tmp;
        }
    }
}
