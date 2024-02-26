import java.io.*;
import java.util.*;

public class Main {
	
	static char[][] keyboard;
	static char[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char l = st.nextToken().charAt(0);
		char r = st.nextToken().charAt(0);
		arr = br.readLine().toCharArray();
		
		keyboard = new char[3][10];
		setKeyboard();
		
		int[] lloc = getKey(l);
		int[] rloc = getKey(r);
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int[] press = getKey(arr[i]);
			
			if (RLCheck(arr[i])) {
				count += Math.abs(rloc[0] - press[0]) + Math.abs(rloc[1] - press[1]);
				rloc = press;
			} else {
				count += Math.abs(lloc[0] - press[0]) + Math.abs(lloc[1] - press[1]);
				lloc = press;
			}
			
			count++;
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void setKeyboard() {
		char[] f = "qwertyuiop".toCharArray();
		char[] s = "asdfghjkl".toCharArray();
		char[] t = "zxcvbnm".toCharArray();
		
		for (int i = 0; i < 10; i++) {
			keyboard[0][i] = f[i];
		}
		
		for (int i = 0; i < 9; i++) {
			keyboard[1][i] = s[i];
		}
		
		for (int i = 0; i < 7; i++) {
			keyboard[2][i] = t[i];
		}
	}
	
	private static int[] getKey(char c) {
		int[] hw = new int[2];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (keyboard[i][j] == c) {
					hw[0] = i;
					hw[1] = j;
				}
			}
		}
		
		return hw;
	}
	
	private static boolean RLCheck(char c) {
		boolean result = false; // f : l, t : r
		
		char[] str = "yuiophjklbnm".toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] == c) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}