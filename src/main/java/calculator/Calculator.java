package calculator;

import java.util.*;

public class Calculator {
    private List<Integer> resultArr = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");

        }

        resultArr.add(result);
        return result;
    }
}