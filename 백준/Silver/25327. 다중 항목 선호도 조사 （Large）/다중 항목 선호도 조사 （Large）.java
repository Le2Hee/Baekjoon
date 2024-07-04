import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 학생의 선호도 수
		int m = Integer.parseInt(st.nextToken()); // 질의
		
		int[][][] count = new int[4][4][4];
		String su, fr, co;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			su = st.nextToken(); // 과목
			fr = st.nextToken(); // 과일
			co = st.nextToken(); // 색상
			
			count[index(su)][index(fr)][index(co)]++;
			count[index(su)][index(fr)][3]++;
			count[index(su)][3][index(co)]++;
			count[index(su)][3][3]++;
			count[3][index(fr)][index(co)]++;
			count[3][index(fr)][3]++;
			count[3][3][index(co)]++;
			count[3][3][3]++;
		}
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			su = st.nextToken(); // 과목
			fr = st.nextToken(); // 과일
			co = st.nextToken(); // 색상
			
			sb.append(count[index(su)][index(fr)][index(co)]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int index(String s) {
		if (s.equals("kor") || s.equals("apple") || s.equals("red")) {
			return 0;
		} else if (s.equals("eng") || s.equals("pear") || s.equals("blue")) {
			return 1;
		} else if (s.equals("math") || s.equals("orange") || s.equals("green")) {
			return 2;
		} else {
			return 3;
		}
	}
}