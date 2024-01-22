import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int at = 0;
		int bt = 0;
		
		int[] team = new int[n];
		int[] time = new int[n];
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " :");
			team[i] = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			time[i] = h * 60;
			time[i] += Integer.parseInt(st.nextToken());
		}
		
		int acount = 0;
		int bcount = 0;
		
		for (int i = 0; i < n - 1; i++) {
			if (team[i] == 1) {
				acount++;
			} else {
				bcount++;
			}
			
			if (acount > bcount) {
				at += time[i + 1] - time[i];
			} else if (acount < bcount) {
				bt += time[i + 1] - time[i];
			}
		}
		
		if (team[n - 1] == 1) {
			acount++;
		} else {
			bcount++;
		}
		
		if (acount > bcount) {
			at += 2880 - time[n - 1]; 
		} else if (acount < bcount) {
			bt += 2880 - time[n - 1];
		}
		
		String ath = format(String.valueOf(at / 60));
		String atm = format(String.valueOf(at % 60));
		String bth = format(String.valueOf(bt / 60));
		String btm = format(String.valueOf(bt % 60));
		sb.append(ath).append(":").append(atm).append("\n").append(bth).append(":").append(btm);
		System.out.println(sb);
	}
	
	private static String format(String s) {
		String result = s;
		if (s.length() == 1) {
			result = "0" + s;
		}
		return result;
	}
}