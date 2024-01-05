import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		LocalDate now = LocalDate.now();
		StringTokenizer st = new StringTokenizer(String.valueOf(now), "-");
		sb.append(st.nextToken()).append("\n").append(st.nextToken()).append("\n").append(st.nextToken());
		System.out.println(sb);
	}
}