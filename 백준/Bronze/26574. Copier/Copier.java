import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			
			sb.append(num).append(" ").append(num).append("\n");
		}
		
		br.close();
		System.out.println(sb);
	}
}