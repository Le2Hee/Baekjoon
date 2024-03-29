import java.io.*;
import java.util.*;

public class Main {
	
	static int oCount, tCount;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		oCount = 0;
		tCount = 0;
		fib(n);
		fibonacci(n);
		sb.append(oCount).append(" ").append(tCount);
		System.out.println(sb);
	}
	
	public static int fib(int n) {
		
        if (n == 1 || n == 2) {
        	oCount++;        	
        	return 1;
        } else {
        	return fib(n - 1) + fib(n - 2);
        }
    }
	
	private static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        
        for (int i = 3; i <= n; i++) {
        	tCount++;
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
    }
}