package InterfaceAssignment;//import java.util.*;

public abstract class  SampleClass implements InterfaceSample{
    @Override
    public void display() {
        System.out.println("Being Display function called in test class");
    }
    @Override
    public void m2(){
        int x = 10;
        int y = 20;
        System.out.println(x+y);
    }
    public abstract void m3();
}
