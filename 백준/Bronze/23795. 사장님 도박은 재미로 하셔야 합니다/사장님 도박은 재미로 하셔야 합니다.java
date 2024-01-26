import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "";
		int sum = 0;
		
		while (!(s = br.readLine()).equals("-1")) {
			int n = Integer.parseInt(s);
			sum += n;
		}
		
		System.out.println(sum);
	}
}