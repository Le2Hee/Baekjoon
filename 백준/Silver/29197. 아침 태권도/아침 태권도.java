import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 학생들의 수
		
		// 원점을 기준으로 학생들의 기울기를 저장하는 set
		HashSet<Double> set = new LinkedHashSet<>();
		
		StringTokenizer st;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken()); // 학생의 x좌표
			double y = Double.parseDouble(st.nextToken()); // 학생의 y좌표
			
			set.add(x / y);
		}
		
		int count = set.size();
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}