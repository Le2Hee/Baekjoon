import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 설치해야되는 컴퓨터
		int m = Integer.parseInt(st.nextToken()); // 에디터 개수
		int k = Integer.parseInt(st.nextToken()); // 도훈이가 설치한 컴퓨터
		int result = (k + 1) * m;
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
}