import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int room = 1; // 칸 개수
		int min = 0; // 현제 대각선 시작 번호
		
		for (; ;) {
			
			if (x <= room + min) {
				
				if (room % 2 == 0) { // 짝수면 내려간다.
					// min이 해당 대각선 전들의 대각선 칸들의 숫자를 의미한다.
					// 해당 대각선의 분자 분모 합은 room + 1이다.
					System.out.println((x - min) + "/" + (room + 1 - (x - min)));
					break;
				} else { // 홀수면 올라간다.
					System.out.println((room + 1 - (x - min)) + "/" + (x - min));
					break;
				}
				
			} else {
				min += room;
				room++;
			}
		}
	}
}