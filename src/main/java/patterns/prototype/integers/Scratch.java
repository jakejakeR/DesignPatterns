package patterns.prototype.integers;

import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {

        // SHALLOW COPY
        System.out.println("### SHALLOW COPY ###");
        A a = new A();
        A a2 = a.clone();
        System.out.println(Arrays.toString(a.arr));
        System.out.println(Arrays.toString(a2.arr));
        a.arr[0] = 111;
        a2.arr[1] = 222;
        System.out.println(Arrays.toString(a.arr));
        System.out.println(Arrays.toString(a2.arr));
        System.out.println();

        // Constructor copy
        System.out.println("### Constructor copy ##");
        A aConstructorCopy = new A();
        System.out.println(aConstructorCopy.getI());
        System.out.println(Arrays.toString(aConstructorCopy.arr));
        aConstructorCopy.setI(127);
        A aConstructorCopy2 = new A(aConstructorCopy);
        aConstructorCopy.arr[0] = 111;
        aConstructorCopy2.arr[1] = 222;
        System.out.println(aConstructorCopy.getI());
        System.out.println(aConstructorCopy2.getI());
        System.out.println(Arrays.toString(aConstructorCopy.arr));
        System.out.println(Arrays.toString(aConstructorCopy2.arr));
        System.out.println();

        B b = new B();
        B b2 = b.clone();
        b.setJ(144);
        b.setI(155);
        System.out.println(b.getI() + " " + b.getJ());
        System.out.println(b2.getI() + " " + b2.getJ());
        System.out.println();

        // DEEP COPY
        System.out.println("## DEEP COPY ###");
        C c = new C();
        C c2 = c.clone();
        System.out.println(Arrays.toString(c.arr));
        System.out.println(Arrays.toString(c2.arr));
        c.arr[0] = 111;
        c2.arr[1] = 222;
        System.out.println(Arrays.toString(c.arr));
        System.out.println(Arrays.toString(c2.arr));
        System.out.println();
    }
}

class A implements Cloneable {
    private int i = 12;
    public int[] arr = {1, 2};

    public A() {
    }

    // copy constructor
    public A(A target) {
        this.i = target.i;
        this.arr = target.arr;
    }

    @Override
    public A clone() {
        try {
            return (A) super.clone();
        } catch (CloneNotSupportedException ignored) {
            System.out.println("ignored exception");
        }
        return null;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class B extends A {
    private int j = 13;

    @Override
    public B clone() {
        return (B) super.clone();
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}

class C implements Cloneable {
    private int i = 12;
    public int[] arr = {1, 2};

    @Override
    public C clone() {
        try {
            var res = (C) super.clone();
            res.arr = res.arr.clone();
            return res;
        } catch (CloneNotSupportedException ignored) {
            System.out.println("ignored exception");
        }
        return null;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}