import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 끊어진 기타줄의 개수
		int m = Integer.parseInt(st.nextToken()); // 기타줄 브랜드
		
		int minPack = Integer.MAX_VALUE; // 패키지 중 가장 낮은 가격
		int minPiece = Integer.MAX_VALUE; // 낱개 중 가장 낮은 가겨
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int pack = Integer.parseInt(st.nextToken()); // 패키지의 가격
			int piece = Integer.parseInt(st.nextToken()); // 낱개의 가격
			
			minPack = Math.min(minPack, pack);
			minPiece = Math.min(minPiece, piece);
		}
		
		int price = 0;
		
		if (minPiece * 6 > minPack) {
			price = (n / 6) * minPack;
			n %= 6;
			
			if (minPiece * n > minPack) {
				price += minPack;
			} else {
				price += (minPiece * n);
			}
		} else {
			price = minPiece * n;
		}
		
		bw.write(Integer.toString(price));
		bw.flush();
		bw.close();
		br.close();
	}
}