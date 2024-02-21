import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int count = 0;
		
		while (!(s = br.readLine()).equals("고무오리 디버깅 끝")) {
			if (s.equals("문제")) {
				count++;
			} else {
				if (count == 0) {
					count += 2;
				} else {
					count--;
				}
			}
		}
		
		bw.write(count == 0 ? "고무오리야 사랑해" : "힝구");
		bw.flush();
		bw.close();
		br.close();
	}
}
