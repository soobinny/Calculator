package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator{

    private static final double PI = 3.14;
    /*
     * static : 모든 인스턴스가 공유하는 상수 -> 메모리 절약
     * final : 불변 값 -> 원주율은 불변값!
     * */

    public void calculateCircleArea(double radius){ // 원의 반지름을 입력받아 원의 넓이 출력
        double circleResult = PI * radius * radius;
        areaArr.add(circleResult);
        System.out.printf("반지름이 %.2f인 원의 넓이: %.2f\n", radius, circleResult);
    }

    public List<Double> getAreaArr() { //2-7 ) 캡슐화 - Getter 메서드 구현
        return areaArr;
    }

    public void setAreaArr(List<Double> areaArr) { // 2-7 ) 캡슐화 - Setter 메서드 구현
        this.areaArr = areaArr;
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
