import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer rst = new StringTokenizer(br.readLine());
		bw.write(Integer.parseInt(st.nextToken()) / Double.parseDouble(st.nextToken()) > Math.pow(Integer.parseInt(rst.nextToken()), 2) * Math.PI / Double.parseDouble(rst.nextToken()) ? "Slice of pizza" : "Whole pizza");
		bw.flush();
		bw.close();
		br.close();
	}
}