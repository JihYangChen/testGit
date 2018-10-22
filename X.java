public class X {
    public void foo1() {
        int a = method1();
    }

    public int foo2() {
        int a = method1();
        return a;
    }

    public void foo3() {
        method1();
    }

    public int method1() {
        return 0;
    }
}
