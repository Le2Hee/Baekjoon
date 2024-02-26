import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		char msL = st.nextToken().charAt(0);
		char msR = st.nextToken().charAt(0);
		char tkL = st.nextToken().charAt(0);
		char tkR = st.nextToken().charAt(0);
		
		if (!(msL == msR || tkL == tkR)) {
			sb.append("?");
		} else {
			if (msL == msR && tkL != tkR) {
				if (msL == 'R') {
					if (tkL == 'P' || tkR == 'P') {
						sb.append("TK");
					} else {
						sb.append("?");
					}
				} else if (msL == 'S') {
					if (tkL == 'R' || tkR == 'R') {
						sb.append("TK");
					} else {
						sb.append("?");
					}
				} else {
					if (tkL == 'S' || tkR == 'S') {
						sb.append("TK");
					} else {
						sb.append("?");
					}
				}
			} else if (tkL == tkR && msL != msR) {
				if (tkL == 'R') {
					if (msL == 'P' || msR == 'P') {
						sb.append("MS");
					} else {
						sb.append("?");
					}
				} else if (tkL == 'S') {
					if (msL == 'R' || msR == 'R') {
						sb.append("MS");
					} else {
						sb.append("?");
					}
				} else {
					if (msL == 'S' || msR == 'S') {
						sb.append("MS");
					} else {
						sb.append("?");
					}
				}
			} else if (tkL == tkR && msL == msR) {
				if (msL == 'R') {
					if (tkL == 'P') {
						sb.append("TK");
					} else if (tkL == 'S') {
						sb.append("MS");
					} else {
						sb.append("?");
					}
				} else if (msL == 'S') {
					if (tkL == 'R') {
						sb.append("TK");
					} else if (tkL == 'P') {
						sb.append("MS");
					} else {
						sb.append("?");
					}
				} else {
					if (tkL == 'S') {
						sb.append("TK");
					} else if (tkL == 'R') {
						sb.append("MS");
					} else {
						sb.append("?");
					}
				}
			}
		} 
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}