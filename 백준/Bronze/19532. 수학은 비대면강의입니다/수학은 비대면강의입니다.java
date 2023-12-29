import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        
        // ax + by = c
        // dx + ey = f
        
        // (ax + by)e - (dx + ey)b = ce - fb
        // aex + bey - dbx - bey = ce - fb
        // aex - dbx = ce - fb
        // x = (ce - fb) / (ae - db)
        
        //    adx + bdy = cd
        // -  adx + aey = af
        // bdy - aey = cd - af
        // y = (cd - af) / (bd - ae);
        
        int x = (c * e - f * b) / (a * e - d * b);
        int y = (c * d - a * f) / (b * d - a * e);
        
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}