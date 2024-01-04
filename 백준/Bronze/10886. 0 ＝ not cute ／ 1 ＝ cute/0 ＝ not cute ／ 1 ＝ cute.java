import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[2];
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			numbers[num]++;
		}
		
		if (numbers[0] > numbers[1]) {
			System.out.println("Junhee is not cute!");
		} else {
			System.out.println("Junhee is cute!");
		}
		
	}
}