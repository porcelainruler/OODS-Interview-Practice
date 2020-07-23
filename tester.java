
import java.util.*;

public class tester {

    public static void func() {
        System.out.println("Here's also working");
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        func();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }

}