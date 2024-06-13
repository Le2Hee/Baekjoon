import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 상점에서 판매하는 무기의 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // 가지고 있는 돈
		int s = Integer.parseInt(st.nextToken()); // 후안의 공격력
		
		int price, ad;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			price = Integer.parseInt(st.nextToken()); // 무기의 가격
			ad = Integer.parseInt(st.nextToken()); // 무기의 공격력
			
			if (price <= x) { // 무기를 살 수 있다면
				if (ad > s) { // 후안의 공격력 보다 높다면 
					sb.append("YES");
					break;
				}
			}
		}
		
		bw.write(sb.length() == 0 ? "NO" : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
