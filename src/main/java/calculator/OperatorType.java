package calculator;

// 3-1 ) Operatortype enum 생성

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }



    //char로 입력받은 연산자를 OperatorType으로 변환하는 메서드

    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.getSymbol() == symbol) {
                return operatorType;
            }
        }
        throw new IllegalArgumentException("연산자 누락입니다."); // 연산자가 enum에 없을 경우 예외처리
    }
}
