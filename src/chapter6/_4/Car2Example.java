package chapter6._4;

public class Car2Example {
    public static void main(String[] args) {
        Car2 mycar = new Car2();
        mycar.keyTurnOn();
        mycar.run();
        //내가 해본것. 내가해본것과 아래의 차이점은?
//        mycar.getSpeed();
//        System.out.println("현재 속도: " + mycar.speed + "km/h");

        int speed = mycar.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");

    }
}
