import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<>();
		list.add(1);
		
		for (int i = 3; ; i += 2) {
			list.add(list.get(list.size() - 1) + i);
			
			if (list.get(list.size() - 1) > n) {
				break;
			}
		}
		
		System.out.println(list.size() - 1);
	}
}
