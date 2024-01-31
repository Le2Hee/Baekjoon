import java.io.*;
import java.util.*;

public class Main {
	
	static String[] in;
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		in = new String[n];
		int[] out = new int[n];
		
		for (int i = 0; i < n; i++) {
			in[i] = br.readLine();
		}
		
		String s = "";
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			out[i] = search(s);
		}
		
		int count = 0;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (out[i] > out[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
	
	private static int search(String s) {
		int index = -1;
		
		for (int i = 0; i < n; i++) {
			if (in[i].equals(s)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
}