package chapter7;

public class ComputerExample extends Calculater {
    public static void main(String[] args) {
        int r = 10;

        Calculater calculater = new Calculater();
        System.out.println("원면적 : " + calculater.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));
    }
}
