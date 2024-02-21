import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray();
		boolean[] small = new boolean[4];
		small[0] = true;
		
		boolean[] big = new boolean[4];
		big[3] = true;
		
		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			
			switch (c) {
			case 'A' :
				if (small[0] || small[1]) {
					small[0] = !small[0];
					small[1] = !small[1];
				}
				
				if (big[0] || big[1]) {
					big[0] = !big[0];
					big[1] = !big[1];
				}
				
				break;
				
			case 'B' :
				if (small[0] || small[2]) {
					small[0] = !small[0];
					small[2] = !small[2];
				}
				
				if (big[0] || big[2]) {
					big[0] = !big[0];
					big[2] = !big[2];
				}
				
				break;
				
			case 'C' :
				if (small[0] || small[3]) {
					small[0] = !small[0];
					small[3] = !small[3];
				}
				
				if (big[0] || big[3]) {
					big[0] = !big[0];
					big[3] = !big[3];
				}
				
				break;
				
			case 'D' :
				if (small[2] || small[1]) {
					small[2] = !small[2];
					small[1] = !small[1];
				}
				
				if (big[2] || big[1]) {
					big[2] = !big[2];
					big[1] = !big[1];
				}
				
				break;
				
			case 'E' :
				if (small[3] || small[1]) {
					small[3] = !small[3];
					small[1] = !small[1];
				}
				
				if (big[3] || big[1]) {
					big[3] = !big[3];
					big[1] = !big[1];
				}
				
				break;
				
			case 'F' :
				if (small[2] || small[3]) {
					small[2] = !small[2];
					small[3] = !small[3];
				}
				
				if (big[2] || big[3]) {
					big[2] = !big[2];
					big[3] = !big[3];
				}
				
				break;
			}
		}
		
		int sIndex = 0;
		int bIndex = 0;
		for (int i = 0; i < 4; i++) {
			if (small[i]) {
				sIndex = i + 1;
			}
			
			if (big[i]) {
				bIndex = i + 1;
			}
		}
		
		sb.append(sIndex).append("\n").append(bIndex);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
