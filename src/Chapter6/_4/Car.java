package Chapter6._4;

public class Car {
    // 필드
    int gas;

    //생성자

    //메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;
            }

            // 만약 while문 뒤에 실행문이 추가적으로 더 있을 경우, break문을 반드시 사용해야 한다. return문은 즉시 메소드를 종료시키기 때문이다.
        }
    }
}
