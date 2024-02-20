package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1"; // 부모 자신의 객체기 때문에 접근 가능
        parent.method1();
        parent.method2();

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}