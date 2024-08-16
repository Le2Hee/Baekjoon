import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // 집의 x좌표
		int y = Integer.parseInt(st.nextToken()); // 집의 y좌표
		int w = Integer.parseInt(st.nextToken()); // 한 블럭을 가는데 걸리는 시간
		int s = Integer.parseInt(st.nextToken()); // 대각선으로 갈 때 걸리는 시간
		
		long diagonal = getDiagonal(square(x, y), w, s); 
		long vertical = w > s ? oddNumber(distance(x, y), s, w) : oddNumber(distance(x, y), w, w); 
		bw.write(Long.toString(diagonal + vertical));
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static long getDiagonal(long square, int w, int s) {
		return w * 2 > s ? square * s : square * 2 * w;
	}
	
	public static long oddNumber(long distance, int multiple, int w) {
		return distance % 2 == 0 ? distance * multiple : (distance -1) * multiple + w; 
	}
	
	public static long square(int x, int y) {
		if (x > y) {
			return y;
		}
		return x;
	}
	
	public static long distance(int x, int y) {
		if (x > y) {
			return x - y;
		}
		return y - x;
	}
}