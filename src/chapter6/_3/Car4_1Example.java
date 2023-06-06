package chapter6._3;

public class Car4_1Example {
    public static void main(String[] agrs) {
        Car4_1 car1 = new Car4_1();
        System.out.println("car1.company: " + car1.company);

        Car4_1 car2 = new Car4_1("자가용");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);

        Car4_1 car3 = new Car4_1("택시", "빨강");
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);



        Car4_1 car4 = new Car4_1("버스", "파랑", 300);
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxspeed: " + car4.maxspeed);





    }
}
