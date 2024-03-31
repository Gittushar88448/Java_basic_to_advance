//Write a program that sorts a list of String objects in descending
//order using a custom Comparator.

package In.CollectionAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator<S> {

    public static void custComp(List<String> strList){
        Collections.sort(strList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(02)) {
                    return 0;
                }else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Lion" , "Tiger" , "Zebra", "Peacock");
        System.out.println(str);
        Comparator.custComp(str);
        System.out.println(str);
    }

}
