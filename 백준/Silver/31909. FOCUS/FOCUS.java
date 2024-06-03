import java.io.*;
import java.util.*;

public class Main {
	
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 명령의 수
		StringTokenizer st = new StringTokenizer(br.readLine()); // 명령
		int k = Integer.parseInt(br.readLine()); // 정지시키는 키의 번호
		
		arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = i;
		}
		
		int num;
		while (n-- > 0) {
			num = Integer.parseInt(st.nextToken());
			find(num);
		}
		
		bw.write(Integer.toString(arr[k]));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void find(int num) {
		int sub;
		
		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j < 8; j++) {
				if (num == Math.pow(2, i) + Math.pow(2, j)) { // 조건에 만족한다면 키를 서로 교체한다.
					sub = arr[i];
					arr[i] = arr[j];
					arr[j] = sub;
					
					break;
				}
			}
		}
	}
}