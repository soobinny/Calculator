package calculator;

import java.util.*;

public class Calculator {

    private List<Integer> calcArr; // 2-6) List 컬렉션 변수 선언
    private List<Double> areaArr;

    private static final double PI = 3.14;
    /*
    * static : 모든 인스턴스가 공유하는 상수 -> 메모리 절약
    * final : 불변 값 -> 원주율은 불변값!
    * */

    public Calculator() {
        this.calcArr = new ArrayList<>(); // 2-6) ArrayList로 구현
        this.areaArr = new ArrayList<>();
    }

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
        calcArr.add(result);
        return result;
    }

    public void calculateCircleArea(double radius){ // 원의 반지름을 입력받아 원의 넓이 출력
        double circleResult = PI * radius * radius;
        areaArr.add(circleResult);
        System.out.printf("반지름이 %.2f인 원의 넓이: %.2f\n", radius, circleResult);
    }

    public List<Integer> getResultArr() { // 2-3 ) 캡슐화 - Getter 메서드 구현
        return calcArr;
    }

    public void setResultArr(List<Integer> calcArr) { // 2-3 ) 캡슐화 - Setter 메서드 구현
        this.calcArr = calcArr;
    }

    public List<Double> getAreaArr() { //2-7 ) 캡슐화 - Getter 메서드 구현
        return areaArr;
    }

    public void setAreaArr(List<Double> areaArr) { // 2-7 ) 캡슐화 - Setter 메서드 구현
        this.areaArr = areaArr;
    }

    public void removeResult(){ // 2-4 ) 첫 번째 인자 삭제하는 메서드 구현
        calcArr.remove(0);
    }

    public void inquiryResult(){ // 2-5 ) resultArr 조회하는 메서드 구현
            for(int i : calcArr){ // inquiry 입력 시 for - each문을 이용하여 resultArr 출력
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public void inquiryArea(){ // 원의 넓이 리스트 조회
        System.out.println();
        System.out.println("[현재 저장된 원의 넓이 리스트]");
        for(Double i : areaArr){
            System.out.printf("%.2f", i);
            System.out.println();
        }
        System.out.println();
        }
    }


