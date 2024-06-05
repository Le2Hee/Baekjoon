import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int jox, joy, jor, bax, bay, bar;
		double jobadis;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			jox = Integer.parseInt(st.nextToken()); // 조규현의 x좌표
			joy = Integer.parseInt(st.nextToken()); // 조규현의 y좌표
			jor = Integer.parseInt(st.nextToken()); // 조규현과 류재명의 거리
			bax = Integer.parseInt(st.nextToken()); // 백승환의 x좌표
			bay = Integer.parseInt(st.nextToken()); // 백승환의 y좌표
			bar = Integer.parseInt(st.nextToken()); // 백승환과 류재명의 거리
			
			jobadis = Math.sqrt(Math.pow(jox - bax, 2) + Math.pow(joy - bay, 2)); // 조규현과 백승환의 거리
			
			if (jobadis == 0) { // 같은 곳에 있을떄
				if (jor == bar) { // 거리가 같은 면 있을 수 있는 곳은 무수히 많다.
					sb.append(-1);
				} else { // 접점이 아예 없다.
					sb.append(0);
				}
			} else if (jobadis == jor + bar) { // 조규현과 백승환의 거리와 2명고 류재명의 거리를 더 했을 떄, 같다면 접점 밖에 없다.
				sb.append(1);
			} else if (jobadis > jor + bar) { // 더 크다면 접점이 생길 수 없다.
				sb.append(0);
			} else { // 더 작다면
				if (jobadis + Math.min(jor, bar) == Math.max(jor, bar)) { // 작은 원이 큰 원 안쪽에서 접점했을뗴
					sb.append(1);
				} else if (jobadis + Math.min(jor, bar) < Math.max(jor, bar)) { // 작은 원이 큰 원아에 다 들어갈때
					sb.append(0);
				} else { // 작은 원이 큰 원 밖에 있을때.
					sb.append(2);
				}
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}