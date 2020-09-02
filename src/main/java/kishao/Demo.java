package kishao;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include= "kishao/Demo.h")
public class Demo {

    static {
        Loader.load();
    }

    static native int multiply(int a, int b);
    static native int add(int a, int b);

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        System.out.println(a + " + " + b + " = " + add(a, b));
    }
    
}