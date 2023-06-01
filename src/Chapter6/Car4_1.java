package Chapter6;

public class Car4_1 {
    // 다른 생성자 호출 : this()를 사용하여 중복 제거.
    //필드
    String company = "현대자동차";
    String model;
    String color;
    int maxspeed;

    //생성자
    Car4_1(){

    }
//    아래와 같이 코드가 중복되면 this()를 사용하여 중복 코드를 없앨 수 있다.
    /*Car4_1(String model) {

        this.model = model;
        this.color = "은색";
        this.maxspeed = 250;
    }

    Car4_1(String model, String color) {
        this.model = model;
        this.color = color;
        this.maxspeed = 250;

    }

    Car4_1(String model, String color, int maxspeed) {
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }*/

//    아래와 같이 만들 수 있다.
    Car4_1(String model) {
        this(model, "은색", 250);
    }

    Car4_1(String model, String color) {
        this(model, color, 250);
    }

    Car4_1(String model, String color, int maxspeed) {
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
}
