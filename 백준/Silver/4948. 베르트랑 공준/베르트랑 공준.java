import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> numbers = new ArrayList<>();
        int max = 0;

        String str;
        while (!(str = br.readLine()).equals("0")) {
            int num = Integer.parseInt(str);
            numbers.add(num);
            max = Math.max(num, max);
        }

        boolean[] isNotPrime = new boolean[max * 2 + 1];
        sieveOfEratosthenes(isNotPrime);

        for (int num : numbers) {
            int count = 0;

            for (int i = num + 1; i <= 2 * num; i++) {
                if (!isNotPrime[i]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static void sieveOfEratosthenes(boolean[] isNotPrime) {
        int n = isNotPrime.length - 1;
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }
}