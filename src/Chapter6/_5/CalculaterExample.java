package Chapter6._5;

public class CalculaterExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculater.pi;
        System.out.println("result1 = " + result1);

        int result2 = Calculater.plus(10, 5);
        System.out.println("result2 = " + result2);

        int result3 = Calculater.minus(10, 5);
        System.out.println("result3 = " + result3);
    }

}
