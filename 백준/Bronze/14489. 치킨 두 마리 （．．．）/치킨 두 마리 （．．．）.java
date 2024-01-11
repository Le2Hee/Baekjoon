import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(br.readLine()) * 2;
		
		if (sum >= price) {
			sb.append(sum - price);
		} else {
			sb.append(sum);
		}
		
		System.out.println(sb);
	}
}