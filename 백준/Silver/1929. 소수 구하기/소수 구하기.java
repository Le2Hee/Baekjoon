import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		boolean[] tf = method(max);
		
		for (int i = min; i <= max; i++) {
			if (tf[i] && i != 1) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	private static boolean[] method(int num) {
		boolean[] tf = new boolean[num + 1];
		Arrays.fill(tf, 2, num + 1, true);
		
		for (int p = 2; p * p <= num; p++) {
            if (tf[p]) {
                for (int i = p * p; i <= num; i += p) {
                	tf[i] = false;
                }
            }
        }
		
		return tf;
	}
}