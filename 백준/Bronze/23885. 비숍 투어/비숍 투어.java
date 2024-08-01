import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 체스판의 가로
		int m = Integer.parseInt(st.nextToken()); // 체스판의 세로
		
		// 위치는 짝수라면 true 홀수라면 false로 설정
		st = new StringTokenizer(br.readLine());
		int startx = Integer.parseInt(st.nextToken());
		int starty = Integer.parseInt(st.nextToken());
		boolean sbx = startx % 2 == 0 ? true : false;
		boolean sby = starty % 2 == 0 ? true : false;
		
		st = new StringTokenizer(br.readLine());
		int endx = Integer.parseInt(st.nextToken());
		int endy = Integer.parseInt(st.nextToken());
		boolean ebx = endx % 2 == 0 ? true : false;
		boolean eby = endy % 2 == 0 ? true : false;
		
		// 체스판의 크기가 둘 중에 하나가 1이라면
		// 도착과 시작의 위치가 같아야한다.
		//
		// 시작위치의 y좌표 짝수, x좌표 짝수
		// 1. 도착위치 y좌표 짝수, x좌표 짝수
		// 2. 도착위치 y좌표 홀수, x좌표 홀수
		//
		// 시작위치의 y좌표 짝수, x좌표 홀수
		// 1. 도착위치 y좌표 짝수, x좌표 홀수
		// 2. 도착위치 y좌표 홀수, y좌표 짝수
		//
		// 시작위치의 y좌표 훌수, x좌표 짝수
		// 1. 도착위치 y좌표 짝수, x좌표 홀수
		// 2. 도착위치 y좌표 홀수, x좌표 짝수
		//
		// 시작위치 y좌표 홀수, x좌표 홀수
		// 1. 도착위치 y좌표 짝수, x좌표 짝수
		// 2. 도착위치 y좌표 홀수, x좌표 홀수
		
		if ((n == 1 || m == 1)) {
			if (startx == endx && starty == endy) {
				sb.append("YES");
			} else {
				sb.append("NO");
			}
		} else if (sbx != sby && ebx != eby) {
			sb.append("YES");
		} else if (sbx == sby && ebx == eby) {
			sb.append("YES");
		} else {
			sb.append("NO");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}