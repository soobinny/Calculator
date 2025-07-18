# 계산기 프로젝트 (Calculator)

- 언어: **Java**
- IDE: **IntelliJ IDEA**



## 프로젝트 개요

Java와 객체지향 설계 원칙(SOLID)을 기반으로 구현한  
**사칙연산 + 원의 넓이 계산기**

단순한 연산 기능 구현을 넘어  
**SRP (단일 책임 원칙)**, **OCP (개방-폐쇄 원칙)** 등을 적용하여  
유지보수성과 확장성을 고려한 구조로 설계

- 주요 키워드: `상속`, `다형성`, `캡슐화`, `인터페이스`, `HashMap`



## 브랜치 구조

main: Level1 (기본 기능 구현)
LEVEL2: Level2 (객체지향 설계 원칙 적용 및 구조 개선)



## 주요 기능

- `+`, `-`, `*`, `/`, `%` 연산 수행
- 원의 넓이 계산 (π * r²)
- 연산 결과 리스트 저장
- 결과 리스트 조회 / 삭제 기능 (`inquiry`, `remove`)
- 연산 클래스 분리 및 인터페이스 적용 (OCP)
- 예외 처리 (`0으로 나누기`, `잘못된 연산자`, `잘못된 메뉴 입력`)



## 객체지향 설계 원칙 적용

1. SRP (단일 책임 원칙): 연산자별 클래스 분리
2. OCP (개방-폐쇄 원칙): 기능 확장 시 기존 코드를 수정하지 않고 연산자 클래스를 추가하여 확장 가능 (Operator 인터페이스 + Map 구조)
3. 캡슐화: 연산 결과 리스트 getter/setter로 접근
4. 다형성: Operator 인터페이스를 통해 다양한 연산자 클래스 공통 처리 가능



## 학습 포인트

- `HashMap<Character, Operator>` 구조를 통해 연산자 기호(`+`, `-`, `*`, `/`, `%`)와 클래스 매핑
- 연산 클래스들의 `operate()` 메서드 통일로 다형성 활용
- 클래스 분리 설계 (`연산자 클래스` ↔ `계산기 클래스`)를 통한 책임 분산
- IllegalArgumentException, ArithmeticException 등을 활용한 예외 처리 방식 학습



## 클래스 구조

calculator/
├── App.java                  : 메인 실행 클래스 (입출력 처리)
├── Calculator.java           : 공통 필드/메서드를 갖는 부모 클래스
├── ArithmeticCalculator.java : 사칙연산 수행 클래스
├── CircleCalculator.java     : 원의 넓이 계산 클래스
├── Operator.java             : 연산자 인터페이스
├── AddOperator.java          : 덧셈 클래스 (implements Operator)
├── SubtractOperator.java     : 뺄셈 클래스
├── MultiplyOperator.java     : 곱셈 클래스
├── DivideOperator.java       : 나눗셈 클래스
└── ModOperator.java          : 나머지 연산 클래스



## 트러블슈팅

[Velog](https://velog.io/@soobinny/JAVA-Calculator-TroubleShooting-%EC%9E%85%EB%A0%A5-%EB%B2%84%ED%8D%BC-%EC%A0%95%EB%A6%AC-nextLine)
