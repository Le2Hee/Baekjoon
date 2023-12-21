import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 사람의 수
		int k = Integer.parseInt(st.nextToken()); // 보성의 번호
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		int index = 0;
		int count = 0;
		
		while (index != k) {
			index = numbers[index];
			count++;
			
			if (count > n) {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);
	}
}