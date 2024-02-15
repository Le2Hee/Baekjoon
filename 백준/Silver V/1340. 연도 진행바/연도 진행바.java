import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ,:");
		String s = st.nextToken();
		int m = mSearch(s);
		int d = Integer.parseInt(st.nextToken());
		int yyyy = Integer.parseInt(st.nextToken());
		int hh = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		int oney = 525_600;
		boolean check = false;
		
		if (yyyy % 400 == 0 || (yyyy % 4 == 0 && yyyy % 100 != 0)) {
			check = true;
			oney += 1440;
		}
		
		double sum = d;
		for (int i = 1; i < m; i++) {
			sum += LocalDate.of(yyyy, i,1).lengthOfMonth();
		}
		
		sum *= 24;
		sum += hh;
		sum *= 60;
		sum += mm;
		sum /= oney;
		sum *= 100;
		sum -= 0.273224043715847;
		
		if (!check) {
			sum -= 0.000748559023876;
		}
		
		bw.write(Double.toString(sum));
        bw.flush();
        bw.close();
        br.close();
	}
	
	private static int mSearch(String m) {
		if (m.equals("January")) {
			return 1;
		} else if (m.equals("February")) {
			return 2;
		} else if (m.equals("March")) {
			return 3;
		} else if (m.equals("April")) {
			return 4;
		} else if (m.equals("May")) {
			return 5;
		} else if (m.equals("June")) {
			return 6;
		} else if (m.equals("July")) {
			return 7;
		} else if (m.equals("August")) {
			return 8;
		} else if (m.equals("September")) {
			return 9;
		} else if (m.equals("October")) {
			return 10;
		} else if (m.equals("November")) {
			return 11;
		} else if (m.equals("December")) {
			return 12;
		}
		
		return -1;
	}
}