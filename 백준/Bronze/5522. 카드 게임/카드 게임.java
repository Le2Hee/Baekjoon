import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 5;
		int sum = 0;
		while (n-- > 0) {
			sum += Integer.parseInt(br.readLine());
		}
		sb.append(sum);
		System.out.println(sb);
	}
}