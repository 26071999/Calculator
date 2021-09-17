import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> c= s-> System.out.println(s.substring(1,5).length());
        c.accept("Prakash");

    }
}
