package calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 3-2) Number타입 제네릭 클래스 구현
public class ArithmeticCalculator<T extends Number> extends Calculator {

    /*
    * 2-9 ) 연산 클래스 변수로 선언, 생성자 초기화
    * */
    private AddOperator add;
    private SubtractOperator sub;
    private MultiplyOperator mul;
    private DivideOperator div;
    private ModOperator mod;

    private Map<OperatorType, Operator> opMap; // 3-1) HashMap의 key: OperatorType enum으로 할당

    public ArithmeticCalculator() {

        opMap = new HashMap<>();

        opMap.put(OperatorType.PLUS, new AddOperator());
        opMap.put(OperatorType.MINUS, new SubtractOperator());
        opMap.put(OperatorType.MULTIPLY, new MultiplyOperator());
        opMap.put(OperatorType.DIVIDE, new DivideOperator());
        opMap.put(OperatorType.MOD, new ModOperator());
    }
    public double calculate(T num1, T num2, char operator) {

        double gen1 = num1.doubleValue(); // 3-2) num1, num2을 실수형으로 타입 변환 (제네릭)
        double gen2 = num2.doubleValue();

        OperatorType operatorType = OperatorType.fromSymbol(operator); // char operator를 enum으로 변환
        Operator op = opMap.get(operatorType); // 연산자 문자에 해당하는 Operator 객체를 맵에서 꺼냄

        if (op == null) {
            throw new IllegalArgumentException("잘못된 연산자입니다.");// 맵에 없는 연산자인 경우 예외 발생

        }else{
            double result = op.operate(gen1, gen2); // 연산 수행 및 결과 저장

            calcArr.add(result);
            return result;
        }
    }

    //3-3 : 메서드에서 입력받은 수보다 큰 수 출력 & 오름차순 출력(추가구현) - Lamda&Stream 구현
    public void printResultsAboveSorted(double value) {
        calcArr.stream()
                .filter(result -> result > value)
                .sorted()
                .forEach(System.out::println);
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
