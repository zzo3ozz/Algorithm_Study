import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String answer = "";

        String start = br.readLine();
        String mid  = br.readLine();
        String end = br.readLine();

        if(start.equals("FizzBuzz")){
            // start가 3과 5의 공배수인 경우 start + 3 은 3의 배수
            answer = "Fizz";
        } else if(start.equals("Fizz")){
            // start가 3의 배수인 경우 start + 3은 3의 배수이거나 3과 5의 공배수임
            if(mid.equals("Buzz") || end.equals("Buzz")){
                // case1: mid 혹은 end가 5의 배수인 경우 start + 3은 5의 배수가 될 수 없음
                answer = "Fizz";
            } else {
                // case2: mid와 end 모두 i이고, end를 5로 나눈 나머지가 4인 경우 - FizzBuzz
                answer = Integer.parseInt(end) % 5 == 4 ? "FizzBuzz" : "Fizz";
            }
        } else {
            // start가 3의 배수가 아닌 경우, start + 3은 i이거나 5의 배수
            if(!start.equals("Buzz")){
                answer = (Integer.parseInt(start) + 3) % 5 == 0 ? "Buzz" : String.valueOf((Integer.parseInt(start) + 3));
            } else {
                if(mid.equals("Fizz")) {
                    answer = String.valueOf(Integer.parseInt(end) + 1);
                } else {
                    answer = String.valueOf(Integer.parseInt(mid) + 2);
                }
            }
        }

        System.out.println(answer);

        br.close();
    }
}