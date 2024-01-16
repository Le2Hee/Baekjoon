import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String id = br.readLine();
		sb.append(":fan::fan::fan:").append("\n").append(":fan::").append(id).append("::fan:").append("\n").append(":fan::fan::fan:");
		System.out.println(sb);
	}
}