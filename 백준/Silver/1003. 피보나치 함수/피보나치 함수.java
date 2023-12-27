import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] number = new int[41][2];
		
		number[0][0] = 1;
		number[0][1] = 0;
		number[1][0] = 0;
		number[1][1] = 1;
		
		for (int i = 2; i < 41; i++) {
			number[i][0] = number[i - 1][0] + number[i - 2][0];
			number[i][1] = number[i - 1][1] + number[i - 2][1];
		}
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			sb.append(number[num][0]).append(" ").append(number[num][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}