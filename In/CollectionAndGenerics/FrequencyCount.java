//Use the Collections class to count the frequency of a particular
//        element in an ArrayList.

package In.CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCount {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,67,3,3,2,96, 67,4,5,75,34);
        System.out.println(Collections.frequency(list , 67));
    }
}
