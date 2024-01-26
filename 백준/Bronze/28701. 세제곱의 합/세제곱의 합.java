import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int sumpow = 0;
		int pow = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			pow += Math.pow(i, 3);
		}
		
		sumpow = (int)Math.pow(sum, 2);
		
		sb.append(sum).append("\n").append(sumpow).append("\n").append(pow);
		System.out.println(sb);
	}
}