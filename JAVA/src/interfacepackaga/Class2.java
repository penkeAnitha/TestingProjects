package interfacepackaga;

public class  Class2 implements Interface1 {
    public void m1() {
        System.out.println("m1");
    }

    public void m2() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.m2();
        class2.m1();
    }
}

