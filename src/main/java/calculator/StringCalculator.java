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

        return 0;
    }
}
