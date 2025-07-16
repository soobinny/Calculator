package calculator;

import java.util.*;

public class Calculator {

    /**
     * 2-8 필드 접근제어자 private -> protected로 변경 : 자식 클래스에서 바로 접근 가능하게끔.
     */
    protected List<Double> calcArr; // 2-6) List 컬렉션 변수 선언
    protected List<Double> areaArr;

    public Calculator() {
        calcArr = new ArrayList<>();
        areaArr = new ArrayList<>();
    }

    }


