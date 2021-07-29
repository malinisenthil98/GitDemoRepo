import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInStringWSet {
    public static void main(String[] args){
        String strwithDup = "Malini Senthilkumar";
        char[] characters = strwithDup.toCharArray();
        Set set = new HashSet();
        StringBuilder sb = new StringBuilder();
        System.out.println("String with Duplicate : "+strwithDup);
        for (char c : characters){
            if (!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println("String without Duplicate : "+sb.toString());
    }
}
