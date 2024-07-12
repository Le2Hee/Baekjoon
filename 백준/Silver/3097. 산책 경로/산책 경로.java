import java.io.*;
import java.util.*;

public class Main {
	
	static int t;
	static double[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		double x, y;
		StringTokenizer st;
		arr = new double[t][2];
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			x = Double.parseDouble(st.nextToken());
			y = Double.parseDouble(st.nextToken());
			
			arr[i][0] = y;
			arr[i][1] = x;
		}
		
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < t; i++) {
			min = Math.min(min, removeLine(i));
		}
		
		int[] basic = basics();
		sb.append(basic[1]).append(" ").append(basic[0]).append("\n").append(String.format("%.2f", min));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 주어진 산책 경로를 그대로 사용한다면 나오는 거리를 계산해 주는 함수.
	private static int[] basics() {
		double nowy = 0;
		double nowx = 0;
		
		for (int i = 0; i < t; i++) {
			nowy += arr[i][0];
			nowx += arr[i][1];
		}
		
		int[] result = new int[2];
		result[0] = (int)nowy;
		result[1] = (int)nowx;
		
		return result;
	}
	
	// 주어진 산책 경로에서 하나를 제외한 거리를 계산해 주는 함수.
	private static double removeLine(int removeIndex) {
		double nowy = 0;
		double nowx = 0;
		
		for (int i = 0; i < t; i++) {
			if (i != removeIndex) {
				nowy += arr[i][0];
				nowx += arr[i][1];
			}
		}
		
		return Math.round(Math.sqrt(Math.pow(nowy, 2) + Math.pow(nowx, 2)) * 100) / 100.0;
	}
}