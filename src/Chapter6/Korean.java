package Chapter6;

public class Korean {
    //필드
    String nation = "대한민국";
    String name;
    String ssn;

    //생성자

    /* public Korean(String n, String s) {
         name = n;
         ssn = s;
         }*/
//    매개 변수의 이름이 너무 짧으면 코드의 가독성이 좋지 않기 때문에 가능하면 초기화 시킬 필드 이름과 비슷하거나 동일한 이름을 사용하는게 좋다.
//    그러나 이렇게되면 필드와 매개변수 이름이 동일하기 때문에 생성자 내부에서 해당 필드에 접근할 수 없다.
//    그 이유는 동일한 이름의 매개 변수가 사용우선순위가 높기 때문이다.
//    그래서 this를 사용하여 객체 자신의 참조를 사용해 구분을 지어주는 것이다.
//    'this.필드'는 참조 변수로 필드를 사용하는 것과 동일하다. 따라서 아래와 같이 만드는게 좋다.
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
