import java.io.*;
import java.util.*;

public class Main {
	
	static int[] num;
	static int m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = new int[14];
		
		for (int i = 0; i < 14; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int bnp = bnp();
		int timing = timing();
		
		if (bnp > timing) {
			System.out.println("BNP");
		} else if (bnp == timing) {
			System.out.println("SAMESAME");
		} else {
			System.out.println("TIMING");
		}
	}
	
	private static int bnp() {
		int money = m;
		int count = 0;
		
		for (int i = 0; i < 14; i++) {
			count += money / num[i]; 
			money %= num[i];
		}
		
		return money + (count * num[13]);
	}
	
	private static int timing() {
		int money = m;
		int count = 0;
		int upcount = 0;
		int downcount = 0;
		
		for (int i = 1; i < 14; i++) {
			if (num[i - 1] < num[i]) {
				upcount++;
				downcount = 0;
				if (upcount >= 3) {
					money += count * num[i];
					count = 0;
				}
			} else if (num[i - 1] > num[i]) {
				upcount = 0;
				downcount++;
				if (downcount >= 3) {
					count += money / num[i];
					money %= num[i];
				}
			} else {
				upcount = 0;
				downcount = 0;
			}
		}
		
		return money + (count * num[13]);
	}
}