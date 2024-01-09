import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = n - 1; i > 0; i--) {
			sum += i;
		}
		
		sum *= 2;
		System.out.println(sum);
	}
}