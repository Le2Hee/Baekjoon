import java.io.*;
import java.util.*;

public class Main {
	
	static List<Integer> primenumber;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		primenumber = new ArrayList<Integer>();
		primenumber.add(1);
		
		for (int i = 2; i < 10000; i++) {
			prime(i);
		}
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int[] result = method(num);
			sb.append(result[0]).append(" ").append(result[1]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void prime(int num) {
		boolean bo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				bo = false;
				break;
			}
		}
		
		if (bo) {
			primenumber.add(num);
		}
	}
	
	private static int[] method(int num) {
		int[] result = new int[2];
		
		for (int i = 0; i < num / 2; i++) {
			int min = num / 2 - i;
			int max = num / 2 + i;
			
			if (search(min) && search(max) && min + max == num) {
				result[0] = min;
				result[1] = max;
				break;
			}
		}
		
		return result;
	}
	
	private static boolean search(int num) {
		boolean bo = false;
		
		for (int i = 0; i < primenumber.size(); i++) {
			if (primenumber.get(i) == num) {
				bo = true;
				break;
			}
		}
		
		return bo;
	}
}