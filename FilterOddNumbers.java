import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> num = List.of(1 ,3,2,5,4,24,78,64,9);
        num.stream()
                .filter(number -> number % 2 == 1)
                .forEach(n -> System.out.println(n));
    }
}
