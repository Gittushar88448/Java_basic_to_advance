import java.util.List;

public class StreamOFString {
    public static void main(String[] args) {
        List<String> names = List.of("Aalu" , "Ajay" , "Ghanshyam" , "Tillu" , "Gajendra");

        System.out.printf("Length is : %d \n ", names.size());

        names.stream().forEach(naam -> System.out.println(naam));
    }
}
