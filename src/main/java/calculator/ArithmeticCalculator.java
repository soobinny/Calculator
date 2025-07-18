package calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {

    /*
    * 2-9 ) 연산 클래스 변수로 선언, 생성자 초기화
    * */
    private AddOperator add;
    private SubtractOperator sub;
    private MultiplyOperator mul;
    private DivideOperator div;
    private ModOperator mod;

    //2-10
    private Map<Character, Operator> opMap; // OCP // HashMap 생성 : Key는 Character, Value는 Operator

    public ArithmeticCalculator() {

        opMap = new HashMap<>();

        opMap.put('+', new AddOperator());
        opMap.put('-', new SubtractOperator());
        opMap.put('*', new MultiplyOperator());
        opMap.put('/', new DivideOperator());
        opMap.put('%', new ModOperator());
    }
    public double calculate(double num1, double num2, char operator) {

        //2-10
        Operator op = opMap.get(operator); // 연산자 문자에 해당하는 Operator 객체를 맵에서 꺼냄

        if (op == null) {
            throw new IllegalArgumentException("잘못된 연산자입니다.");// 맵에 없는 연산자인 경우 예외 발생

        }else{
            double result = op.operate(num1, num2); // 연산 수행 및 결과 저장

            calcArr.add(result);
            return result;
        }
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
