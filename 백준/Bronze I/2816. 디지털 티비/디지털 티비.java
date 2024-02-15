import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = "";
		int kbs1Index = 0;
		int kbs2Index = 0;
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			
			if (s.equals("KBS1")) {
				kbs1Index = i;
			} else if (s.equals("KBS2")) {
				kbs2Index = i;
			}
		}
		
		if (kbs1Index < kbs2Index) {
			for(int i=0; i<kbs1Index; i++) {
				sb.append(1);
			}
			
			for(int i=0; i<kbs1Index; i++) {
				sb.append(4);
			}
			
			for(int i=0; i<kbs2Index; i++) {
				sb.append(1);
			}
			
			for(int i=0; i<kbs2Index - 1; i++) {
				sb.append(4);
			}
		} else {
			for (int i=0; i<kbs1Index; i++) {
				sb.append(1);
			}
			
			for (int i=0; i<kbs1Index; i++) {
				sb.append(4);
			}
			
			for (int i=0; i<kbs2Index + 1; i++) {
				sb.append(1);
			}
			
			for (int i=0; i<kbs2Index; i++) {
				sb.append(4);
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}