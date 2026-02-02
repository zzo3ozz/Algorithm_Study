import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 3; i > 0; i--) {
            String line = br.readLine();

            if(Character.isDigit(line.charAt(0))) {
                System.out.println(isFizzBuzz(Integer.valueOf(line) + i));
                break;
            }
        }

        br.close();
    }

    public static String isFizzBuzz(int n) {
        if(n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if(n % 3 == 0) {
            return "Fizz";
        }

        if(n % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(n);
    }
}