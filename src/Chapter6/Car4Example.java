package Chapter6;

public class Car4Example {
    public static void main(String[] agrs) {
        Car4 car1 = new Car4();
        System.out.println("car1.company: " + car1.company);

        Car4 car2 = new Car4("자가용");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);

        Car4 car3 = new Car4("택시", "빨강");
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);



        Car4 car4 = new Car4("버스", "파랑", 300);
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxspeed: " + car4.maxspeed);





    }


}
