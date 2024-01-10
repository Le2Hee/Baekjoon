import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new LinkedList<>();
		String str = br.readLine();
		int ycount = 0;
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == '(' && str.charAt(i + 1) == '(') {
				list.add(1); // x
			} else if (str.charAt(i) == ')' && str.charAt(i + 1) == ')') {
				list.add(2); // y
				ycount++;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				count += ycount;
			} else {
				ycount--;
			}
		}
		
		System.out.println(count);
	}
}