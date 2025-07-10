package calculator;

import java.util.Scanner;


public class App {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                while (true) {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                    int num1 = sc.nextInt();

                    System.out.print("두 번째 숫자를 입력하세요: ");
                    // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                    int num2 = sc.nextInt();

                    System.out.print("사칙연산 기호를 입력하세요: ");
                    // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                    char operator = sc.next().charAt(0);

                    int result = 0;

                    if (operator == '+') {
                        result = num1 + num2;
                        System.out.println("결과 : " + result);
                    } else if (operator == '-') {
                        result = num1 - num2;
                        System.out.println("결과 : " + result);
                    } else if (operator == '*') {
                        result = num1 * num2;
                        System.out.println("결과 : " + result);
                    } else {
                        if (num2 == 0) {
                            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        } else {
                            result = num1 / num2;
                            System.out.println("결과 : " + result);
                        }

                    }
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    String exit = sc.next();
                    if (exit.equals("exit")) {
                        break;

                    }

                }
            }
    }




