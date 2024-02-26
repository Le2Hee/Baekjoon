import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		if(n >= 0 && n <= 10) {
			System.out.println(1);
		} else {
            int count = 2;
            
            for(int i = 11; ; i = i * 10 + 1) {
                if(n >= i && n <= i * 10) {
                    sb.append(count);
                    break;
                }
                count++;
            }
        }
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
