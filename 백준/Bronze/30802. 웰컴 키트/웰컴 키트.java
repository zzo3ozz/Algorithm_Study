import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] sizes = br.readLine().split(" ");

        String[] TP =  br.readLine().split(" ");
        int T = Integer.parseInt(TP[0]);
        int P = Integer.parseInt(TP[1]);

        int cntT = Arrays.stream(sizes)
                .mapToInt(s -> {
                    int size =  Integer.parseInt(s);

                    return size % T == 0 ?
                            size / T :
                            size / T + 1;
                }).sum();
        int[] cntP = { N / P, N % P };

        StringBuilder sb = new StringBuilder();
        sb.append(cntT).append("\n")
                .append(cntP[0] + " " + cntP[1]);

        System.out.println(sb);

        br.close();
    }
}