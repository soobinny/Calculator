package calculator;

public class DivideOperator implements Operator {
    public double operate(double num1, double num2){// 다형성을 위해 모든 계산 메서드의 이름을 operate로 통일
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }
}
