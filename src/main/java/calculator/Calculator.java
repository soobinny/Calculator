package calculator;

import java.util.*;

public class Calculator {

    private List<Integer> resultArr; // 2-6) List 컬렉션 변수 선언

    public Calculator() {
        this. resultArr = new ArrayList<>(); // 2-6) ArrayList로 구현
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
        resultArr.add(result);
        return result;
    }

    public List<Integer> getResultArr() { // 2-3 ) 캡슐화 - Getter 메서드 구현
        return resultArr;
    }

    public void setResultArr(List<Integer> resultArr) { //// 2-3 ) 캡슐화 - Setter 메서드 구현
        this.resultArr = resultArr;
    }

    public void removeResult(){ // 2-4 ) 첫 번째 인자 삭제하는 메서드 구현
        resultArr.remove(0);
    }

    public void inquiryResult(){ // 2-5 ) resultArr 조회하는 메서드 구현
            for(int i : resultArr){ // inquiry 입력 시 for - each문을 이용하여 resultArr 출력
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
