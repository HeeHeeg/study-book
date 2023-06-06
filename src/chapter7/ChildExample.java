package chapter7;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        System.out.println(parent.field1);

        /*parent.field2 = "data2";      // 형변환이 안되서 사용불가
        parent.method3();*/

        Child child = (Child) parent;
        ((Child) parent).field2 = "yyy";
        ((Child) parent).method3();

    }
}
