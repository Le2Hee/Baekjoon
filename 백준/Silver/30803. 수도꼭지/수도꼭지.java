import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); // 수도꼭지의 수
		StringTokenizer st = new StringTokenizer(br.readLine()); // 물의 양
		int[] waters = new int[n];
		boolean[] watersToggle = new boolean[n];
		long result = 0;
		
		for (int i = 0; i < n; i++) {
			waters[i] = Integer.parseInt(st.nextToken());
			result += waters[i];
		}
		
		sb.append(result).append("\n");
		
		int q = Integer.parseInt(br.readLine()); // 조작의 수
		
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int sortation = Integer.parseInt(st.nextToken());
			
			if (sortation == 1) { // 물 양 변경
				int tap = Integer.parseInt(st.nextToken()); // 수도꼭지 번호
				int water = Integer.parseInt(st.nextToken()); // 변경할 물의 양
				if (watersToggle[tap - 1] == false) {
					result -= waters[tap - 1];
					result += water;
				}
				waters[tap - 1] = water;
			} else { // 2 토글 변경
				int tap = Integer.parseInt(st.nextToken()); // 수도꼭지 번호
				watersToggle[tap - 1] = !watersToggle[tap - 1];
				
				if (watersToggle[tap - 1] == false) {
					result += waters[tap - 1];
				} else {
					result -= waters[tap - 1];
				}
			}
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
}