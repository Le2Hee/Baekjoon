import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] p1 = new int[2]; // 첫번째 점
		int[] p2 = new int[2]; // 두번째 점
		int[] p3 = new int[2]; // 세번째 점
		
		String[] s = br.readLine().split(" ");
		p1[0] = Integer.parseInt(s[0]); // x좌표
		p1[1] = Integer.parseInt(s[1]); // y좌표
		
		s = br.readLine().split(" ");
		p2[0] = Integer.parseInt(s[0]); // x좌표
		p2[1] = Integer.parseInt(s[1]); // y좌표
		
		s = br.readLine().split(" ");
		p3[0] = Integer.parseInt(s[0]); // x좌표
		p3[1] = Integer.parseInt(s[1]); // y좌표
		
		int sum = (p1[0] * p2[1]) + (p2[0] * p3[1]) + (p3[0] * p1[1]);
		
		sum = sum - (p1[1] * p2[0]) - (p2[1] * p3[0]) - (p3[1] * p1[0]);
		
		if (sum > 0) {
			System.out.println(1);
		} else if (sum < 0) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}
		
	}
}