import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 문자열의 길이
		
		if (n < 7) {
			System.out.println("NO!");
		} else {
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			int num5 = 0;
			int num6 = 0;
			int num7 = 0;
			
			int num11 = 0;
			int num12 = 0;
			int num13 = 0;
			int num14 = 0;
			int num15 = 0;
			int num16 = 0;
			int num17 = 0;
			
			int num21 = 0;
			int num22 = 0;
			int num23 = 0;
			int num24 = 0;
			int num25 = 0;
			int num26 = 0;
			int num27 = 0;
			
			String str = br.readLine();
			
			for (int i = 0; i < str.length(); i++) {
				
				if (str.charAt(i) == 'r' || str.charAt(i) == 'R') {
					num1 = 1;
					if (str.charAt(i) == 'r') {
						num11 = 1;
					} else {
						num21 = 1;
					}
				} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
					num2 = 1;
					if (str.charAt(i) == 'o') {
						num12 = 1;
					} else {
						num22 = 1;
					}
				} else if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
					num3 = 1;
					if (str.charAt(i) == 'y') {
						num13 = 1;
					} else {
						num23 = 1;
					}
				}  else if (str.charAt(i) == 'g' || str.charAt(i) == 'G') {
					num4 = 1;
					if (str.charAt(i) == 'g') {
						num14 = 1;
					} else {
						num24 = 1;
					}
				} else if (str.charAt(i) == 'b' || str.charAt(i) == 'B') {
					num5 = 1;
					if (str.charAt(i) == 'b') {
						num15 = 1;
					} else {
						num25 = 1;
					}
				} else if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
					num6 = 1;
					if (str.charAt(i) == 'i') {
						num16 = 1;
					} else {
						num26 = 1;
					}
				} else if (str.charAt(i) == 'v' || str.charAt(i) == 'V') {
					num7 = 1;
					if (str.charAt(i) == 'v') {
						num17 = 1;
					} else {
						num27 = 1;
					}
				}
			}
			
			int mix = num1 + num2 + num3 + num4 + num5 + num6 + num7;
			int low = num11 + num12 + num13 + num14 + num15 + num16 + num17;
			int up = num21 + num22 + num23 + num24 + num25 + num26 + num27;
			
			if (mix != 7) {
				System.out.println("NO!");
			} else {
				if (low == 7 && up != 7) {
					System.out.println("yes");
				} else if (low != 7 && up == 7) {
					System.out.println("YES");
				} else if (low == 7 && up == 7) {
					System.out.println("YeS");
				} else {
					System.out.println("NO!");
				}
			}
			
		}
	}
}