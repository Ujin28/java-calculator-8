package calculator;

import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String delimiter = ",|:"; // 기본 구분자

        // 커스텀 구분자 처리
        if (input.startsWith("//")) {
            int index = input.indexOf("\n");
            delimiter = Pattern.quote(input.substring(2, index));
            input = input.substring(index + 1); // 실제 개행 처리
        }



        String[] numbers = input.split(delimiter);
        int sum = 0;
        for (String num : numbers) {
            if (num.isEmpty()) continue;
            int number = parseNumber(num);
            sum += number;
        }
        return sum;

    }

    private int parseNumber(String num) {
        try {
            int value = Integer.parseInt(num);
            if (value < 0) {
                throw new IllegalArgumentException("양수만 입력하세요");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 있습니다.");
        }
    }
}
