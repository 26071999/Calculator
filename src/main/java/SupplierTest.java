import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String[] names = {"Prakash", "Hari", "Siva", "Mani", "Deva"};
            int x = (int) (Math.random() * 4);
            return names[x];
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
