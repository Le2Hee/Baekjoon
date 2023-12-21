import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
		}
		
		if (t <= sum) {
			System.out.println("Padaeng_i Happy");
		} else {
			System.out.println("Padaeng_i Cry");
		}
	}
}