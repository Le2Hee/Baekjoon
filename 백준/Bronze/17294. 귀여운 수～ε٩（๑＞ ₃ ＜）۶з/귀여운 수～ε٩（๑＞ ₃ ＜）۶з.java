import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] str = br.readLine().toCharArray();
		boolean ch = true;
		
		if (str.length > 1) {
			int num = str[1] - str[0];
			
			for (int i = 2; i < str.length; i++) {
				if (str[i] - str[i - 1] != num) {
					ch = false;
					break;
				}
			}
		}
		
		bw.write(ch ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
		bw.flush();
		bw.close();
		br.close();
	}
}
