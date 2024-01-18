import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = {
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken())
		};
		
		Arrays.sort(numbers);
		
		int num1 = numbers[0] + numbers[3];
		int num2 = numbers[1] + numbers[2];
		int result = Math.abs(num1 - num2);
		System.out.println(result);
	}
}
