import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] memo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        memo = new int[n + 2];
        memo[1] = 1; memo[2] = 3;

        System.out.println(countBlock(n));

        br.close();
    }

    public static int countBlock(int n) {
        // A_n = A_n-2 * 2 + A_n-1
        if(memo[n] == 0) {
            memo[n] = (countBlock(n - 2) * 2 + countBlock(n - 1)) % 10007;
        }

        return memo[n];
    }
}