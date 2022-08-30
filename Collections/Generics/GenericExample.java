package Generics;//import java.util.*;

public class GenericExample<T1 ,T2>{
    T1 t1;
    T2 t2;

    public GenericExample(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public static void main(String[] args) {
        GenericExample<String, Integer> genericExample = new GenericExample<>("Palash",1);

        String str = genericExample.getT1();
        System.out.println(str);
    }
}
