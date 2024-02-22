import java.io.*;
import java.util.*;

public class Main {
	
	static String[] key = {"Algorithm", "DataAnalysis", "ArtificialIntelligence", "CyberSecurity", "Network", "Startup", "TestStrategy"};
	static String[] val = {"204", "207", "302", "B101", "303", "501", "105"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Map<String, String> map = new LinkedHashMap<>();
		for (int i = 0; i < 7; i++) {
			map.put(key[i], val[i]);
		}
		
		int t = Integer.parseInt(br.readLine());
		String s;
		while (t-- > 0) {
			s = br.readLine();
			sb.append(map.get(s)).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
