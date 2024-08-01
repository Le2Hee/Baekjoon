import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 체스판의 가로 세로는 사용하지 않아도 된다.
		
		// 위치는 짝수라면 true 홀수라면 false로 설정
		st = new StringTokenizer(br.readLine());
		boolean startx = Integer.parseInt(st.nextToken()) % 2 == 0 ? true : false;
		boolean starty = Integer.parseInt(st.nextToken()) % 2 == 0 ? true : false;
		
		st = new StringTokenizer(br.readLine());
		boolean endx = Integer.parseInt(st.nextToken()) % 2 == 0 ? true : false;
		boolean endy = Integer.parseInt(st.nextToken()) % 2 == 0 ? true : false;
		
		
		// 갈 수 있는 경우만 체크
		// 시작위치의 y, x좌표 둘 다 짝수일 때
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
		if (startx == endx && starty == endy) {
			sb.append("YES");
		} else if (startx != endx && starty != endy) {
			sb.append("YES");
		}
		
		// 갈 수 없다면
		if (sb.length() == 0) {
			sb.append("NO");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}