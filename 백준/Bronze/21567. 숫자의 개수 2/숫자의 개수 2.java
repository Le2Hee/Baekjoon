import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	private static final int BUF_SIZE = 1 << 13;
    private static final byte[] buf = new byte[BUF_SIZE];
    private static int cursor = -1, end;
    
    private static byte read() throws IOException {
        if (++cursor == end) {
            end = System.in.read(buf, 0, BUF_SIZE);
            cursor = 0;
        }
        
        return buf[cursor];
    }
    
    private static int readInt() throws IOException {
        int res = 0;
        int in = read();
        // 공백 및 줄 바꿈 문자 무시
        while (in <= 32) {
            in = read();
        }
        // 숫자 읽기
        while (in > 32) {
            res = (res << 3) + (res << 1) + (in & 15);
            in = read();
        }
        return res;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = readInt();
		int b = readInt();
		int c = readInt();
		
		BigInteger mul = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(c)); 
		
		int[] counts = new int[10];
		char[] marr = String.valueOf(mul).toCharArray();
		
		for (int i = 0; i < marr.length; i++) {
			counts[marr[i] - '0']++;
		}
		
		for (int count : counts) {
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}