import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 학생 수
		int k = Integer.parseInt(st.nextToken()); // 확인하는 인원 수
		
		List<Integer> list = new LinkedList<>(); // 학생을 저장할 리스트
		
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int count = 0, oindex, tindex; // 총 점호시간, 1학년 인덱스, 2학년 인덱스
		while(list.size() > 0) {
			count++;
			oindex = -1;
			tindex = -1;
			
			for (int i = 0; i < (list.size() < k ? list.size() : k); i++) {
				if (list.get(i) == 1 && oindex == -1) {
					oindex = i;
				} else if (list.get(i) == 2 && tindex == -1) {
					tindex = i;
				}
			}
			
			if (oindex != -1) { // 확인하는 인원 중 1학년이 있다면
				list.remove(oindex);
				
				if (oindex < tindex) { // 인덱스가 작다면 remove시 인덱스가 줄어든다.
					tindex--;
				}
			}
			
			if (tindex != -1) { // 확인하는 인원 중 2학년이 있다면
				list.remove(tindex);
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}