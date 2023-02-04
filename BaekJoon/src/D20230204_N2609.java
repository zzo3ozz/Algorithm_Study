import java.io.*;
import java.util.StringTokenizer;

public class D20230204_N2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int min = a - b > 0 ? b : a; // 둘 중 작은 수
		
		int maxFac = 1; int minMul = 1;
		
		// 최대 공약수 찾기
		for(int i = 2; i <= min; i++) {
			if(a % i == 0 && b % i == 0)
				maxFac = i;
		}
		
		// 최소 공배수 = 최대 공약수 * (수1 / 최대공약수) * (수2 / 최대공약수) 
		minMul = maxFac * (a / maxFac) * (b / maxFac);
		
		System.out.print(maxFac + "\n" + minMul);
		
		br.close();
	}
}
