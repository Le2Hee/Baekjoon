import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		String[] num = br.readLine().split("");
		
		HashMap<String, Integer> e = new HashMap<>();
		for (int i = 1; i <= 26; i++) {
			e.put(String.valueOf((char) (i + 96)), i);
		}
		
		n = e.get(num[0]);
		
		for (int i = 1; i < num.length; i++) {
			n += e.get(num[i]) * Math.pow(31, i);
		}
		
		System.out.println(n);
		
	}
}