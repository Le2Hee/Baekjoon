import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] numbers = new String[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = br.readLine();
		}
		
		HashSet<String> set;
		int count = 0;
		
		for (int i = 1; i <= numbers[0].length(); i++) {
			set = new LinkedHashSet<>();
			for (int j = 0; j < n; j++) {
				set.add(numbers[j].substring(numbers[j].length() - i, numbers[j].length()));
			}
			
			if (set.size() == n) {
				count = i;
				break;
			}
		}
		
		System.out.println(count);
	}
}