//. Write a method concatenate Strings that takes variable arguments of String type and
//concatenates them into a single string

package In.CollectionAndGenerics;

public class ConcatStringVarargs {
    public static String concatString(String ...str){
        StringBuilder st = new StringBuilder();
        for (String i : str) {
            st.append(i).append(" ");
        }
        return st.toString();
    }

    public static void main(String[] args) {
        System.out.println(ConcatStringVarargs.concatString("Hello" , "this", "is" , "tushar"));
    }
}
