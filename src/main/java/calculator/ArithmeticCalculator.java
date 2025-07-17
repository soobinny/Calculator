package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {

    /*
    * 2-9 ) 연산 클래스 변수로 선언, 생성자 초기화
    * */
    private AddOperator add;
    private SubtractOperator sub;
    private MultiplyOperator mul;
    private DivideOperator div;

    public ArithmeticCalculator() {
        add = new AddOperator();
        sub = new SubtractOperator();
        mul = new MultiplyOperator();
        div = new DivideOperator();
    }
    public double calculate(double num1, double num2, char operator) {

        double result = 0;

        switch (operator) {
            case '+':
                result = add.operate(num1, num2);
                break;

            case '-':
                result = sub.operate(num1,num2);
                break;

            case '*':
                result = mul.operate(num1,num2);
                break;

            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = div.operate(num1,num2);
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");

        }
        calcArr.add(result);
        return result;
    }

    public List<Double> getResultArr() { // 2-3 ) 캡슐화 - Getter 메서드 구현
        return calcArr;
    }

    public void setResultArr(List<Double> calcArr) { // 2-3 ) 캡슐화 - Setter 메서드 구현
        this.calcArr = calcArr;
    }

    public void removeResult(){ // 2-4 ) 첫 번째 인자 삭제하는 메서드 구현
        calcArr.remove(0);
    }

    public void inquiryResult(){ // 2-5 ) resultArr 조회하는 메서드 구현
        for(double i : calcArr){ // inquiry 입력 시 for - each문을 이용하여 resultArr 출력
            System.out.print(i + " ");
            System.out.println();
        }
        System.out.println();
    }
}
