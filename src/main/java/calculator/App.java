package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {

//        Calculator calculator = new Calculator(); // 2-2) Calculator 인스턴스 생성
        Scanner sc = new Scanner(System.in);

        CircleCalculator circle = new CircleCalculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        while(true){

            //원의 넓이 / 사칙연산 Scanner로 입력받기
            System.out.print("원의 넓이 구하기 (Circle) 혹은 사칙 연산 (Calculator) 중 선택하여 입력하세요: ");
            String input = sc.nextLine();
            if(input.equals("Circle") || input.equals("Calculator")){
                if (input.equals("Circle")) {
                    System.out.print("원의 반지름을 입력하세요 : ");
                    double radius = sc.nextDouble();
                    sc.nextLine();
                    circle.calculateCircleArea(radius);
                    circle.inquiryArea();

                }else if (input.equals("Calculator")) {
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

                        double result = arithmeticCalculator.calculate(num1, num2, operator);

                        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                        String remove = sc.next();
                        if (remove.equals("remove")) {
                            arithmeticCalculator.removeResult();
                        }

                        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                        String inquiry = sc.next();
                        if (inquiry.equals("inquiry")) {
                            arithmeticCalculator.inquiryResult();
                        }

                        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                        String exit = sc.next();
                        sc.nextLine();
                        if (exit.equals("exit")) {
                            break;
                        }

                    }

            }
            }else{
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

        }




    }
}



