import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		StringTokenizer st;
		int count, startx, starty, endx, endy, n, planetx, planety, planetr;
		double startdis, enddis;
		while (t-- > 0) {
			count = 0; // 진입, 이탈 횟수
			
			st = new StringTokenizer(br.readLine());
			startx = Integer.parseInt(st.nextToken()); // 출발점 x좌표
			starty = Integer.parseInt(st.nextToken()); // 출발점 y좌표
			endx = Integer.parseInt(st.nextToken()); // 도착점 x좌표
			endy = Integer.parseInt(st.nextToken()); // 도착점 y좌표
			
			n = Integer.parseInt(br.readLine()); // 행성의 개수
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				planetx = Integer.parseInt(st.nextToken()); // 행성의 x좌표
				planety = Integer.parseInt(st.nextToken()); // 행성의 y좌표
				planetr = Integer.parseInt(st.nextToken()); // 행성의 반지름
				
				startdis = Math.sqrt(Math.pow(startx - planetx, 2) + Math.pow(starty - planety, 2)); // 행성에서 출발점 까지의 거리
				enddis = Math.sqrt((Math.pow(endx - planetx, 2) + Math.pow(endy - planety, 2))); // 행성에서 도착점 까지의 거리
				
				// 원 안에 출발점이 있는지 확인하면서 도착점은 밖에 잇는지 확인
				if (startdis <= planetr && enddis > planetr) {
					count++;
				}
				
				// 원 안에 도착점이 있으면서 출발점은 밖에 있는지 확인.
				if (enddis <= planetr && startdis > planetr) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}