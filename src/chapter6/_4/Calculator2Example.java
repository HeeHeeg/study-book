package chapter6._4;

public class Calculator2Example {
    public static void main(String[] args) {
        Calculator2 calcu2 = new Calculator2();

        //정사각형 넓이 구하기
        double result1 = calcu2.areaRectangle(10);

        //직사각형 넓이 구하기
        double result2 = calcu2.areaRectangle(10, 20);

        //결과 출력
        System.out.println("정사각형 넓이 =" + result1);
        System.out.println("직사학경 넓이 =" + result2);
    }
}
