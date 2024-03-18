import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String[][] map = new String[10][10];
		String s;
		
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				s = st.nextToken();
				map[i][j] = s;
			}
		}
		
		int check = 0;
		boolean b = true;
		
		for (int i = 0; i < 10; i++) {
			s = map[i][0];
			b = true;
			
			for (int j = 1; j < 10; j++) {
				if (!s.equals(map[i][j])) {
					b = false;
					break;
				}
			}
			
			if (b) {
				check = 1;
				break;
			}
		}
		
		if (check != 1) {
			for (int i = 0; i < 10; i++) {
				s = map[0][i];
				b = true;
				
				for (int j = 1; j < 10; j++) {
					if (!s.equals(map[j][i])) {
						b = false;
						break;
					}
				}
				
				if (b) {
					check = 1;
					break;
				}
			}
		}
		
		bw.write(Integer.toString(check)); 
		bw.flush();
		bw.close();
		br.close();
	}
}