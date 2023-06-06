package chapter6._4;

public class Computer {
    // sum1()과 sum2()의 메소드 실행문이 완전 일치하는것을 볼 수 있다.매개 변수의 선언 방법만 다를 뿐이지
    // 매개 변수의 타입이 배얄이므로 처리 내용이 같을수밖에 ㅇ벗다.
    int sum1(int[] values) {
        int sum1 = 0;
        for (int i = 0; i < values.length; i++) {
            sum1 += values[i];
        }
        return sum1;
    }

    int sum2(int ... values) {
        int sum2 = 0;
        for (int i = 0; i < values.length; i++) {
            sum2 += values[i];
        }
        return  sum2;
    }
}
