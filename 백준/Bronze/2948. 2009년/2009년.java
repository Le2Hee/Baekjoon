import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		LocalDate date = LocalDate.of(2009, m, d);
		DayOfWeek week = date.getDayOfWeek();
		System.out.println(week.getDisplayName(TextStyle.FULL, Locale.US));
	}
}