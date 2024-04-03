//
//. Write a method that swaps two elements in an ArrayList, given
//their indices.
package In.CollectionAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapNumArrayList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,3,8,30);
        Collections.swap(list , 0 , 3);
        System.out.println(list);
    }

}
