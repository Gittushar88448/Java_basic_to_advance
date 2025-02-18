import java.util.ArrayList;
import java.util.List;

public class FilterAndReduceStrings {
    public static void main(String[] args) {
        List<String> list = List.of("Hello this is", "bad" , "boy", "Tushar");
       String result =  list.stream()
                                .filter(name -> name.length() > 5)
                                .reduce("" , (a,b) -> a+ " "+ b);
        System.out.println(result);
    }
}
