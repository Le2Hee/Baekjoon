import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int[] numbers;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		numbers = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		while (true) {
			for (int i = 0; i < 4; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int num = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = num;
					print();
				}
			}
			
			boolean bo = true;
			
			for (int i = 0; i < 5; i++) {
				if (numbers[i] != i + 1) {
					bo = false;
				}
			}
			
			if (bo) {
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	private static void print() {
		for (int i = 0; i < 5; i++) {
			sb.append(numbers[i]).append(" ");
		}
		sb.append("\n");
	}
	
}