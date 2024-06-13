import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 참가자의 수
		StringTokenizer st = new StringTokenizer(br.readLine()); // 티셔츠 사이즈별 신청자의 수
		
		int[] tshirt = new int[6]; // 사이즈별 신청자의 수를 저장하는 배열
		for (int i = 0; i < 6; i++) {
			tshirt[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()); // 티셔츠와 팬의 묶음 수
		int tbunch = Integer.parseInt(st.nextToken()); // 티셔츠 한 묶음
		int pbunch = Integer.parseInt(st.nextToken()); // 펜의 한 묶음
		
		int tsum = 0; // 주문할 티셔츠 묶음 수
		for (int i = 0; i < 6; i++) {
			tsum += (tshirt[i] / tbunch) + (tshirt[i] % tbunch == 0 ? 0 : 1);
		}
		
		// 주문할 티셔츠 묶음 수와 펜의 묶음 수, 낱개 수
		sb.append(tsum).append("\n").append(n / pbunch).append(" ").append(n % pbunch);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}