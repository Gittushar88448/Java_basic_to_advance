//Create a program that reverses the elements of a List and prints
//the reversed list.

package In.CollectionAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,82,25,89);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}
