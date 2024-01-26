import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if (n == 1) {
			System.out.println(1);
		} else {
			list = new LinkedList<>();
			
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					list.add(i);
				}
			}
			
			if (list.size() == 1) {
				System.out.println(list.get(0));
			} else {
				System.out.println(val());
			}
		}
	}
	
	private static int val() {
		List<Integer> sub = new LinkedList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if ((i + 1) % 2 == 0) {
				sub.add(list.get(i));
			}
		}
		
		if (sub.size() == 1) {
			return sub.get(0);
		} else {
			list = new LinkedList<>(sub);
			return val();
		}
	}
}