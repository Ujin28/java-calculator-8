package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        System.out.println("덧셈할 문자열을 입력해주세요");
        String snum = Console.readLine(); // 입력 예: "1,2,3" 또는 "//;\n1;2;3"

        StringCalculator sc = new StringCalculator();
        int result = sc.add(snum);
        System.out.println("결과 : " + result);

    }
}