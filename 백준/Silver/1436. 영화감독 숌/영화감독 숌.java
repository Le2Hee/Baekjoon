import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = 665;
		
		while (n != 0) {
			result++;
			String str = String.valueOf(result);
			
			for (int j = 0; j < str.length() - 2; j++) {
				if (str.charAt(j) == '6' && str.charAt(j + 1) == '6' && str.charAt(j + 2) == '6') {
					n--;
					break;
				}
			}
		}
		
		System.out.println(result);
    }
}