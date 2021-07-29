public class RemoveDuplicateInString {
    public static void main(String[] args){
        String strWithDup = "Malini Senthilkumar";
        char[] characters = strWithDup.toCharArray();
        boolean[] found = new boolean[256];
        boolean[] secondfound = new boolean[250];
        StringBuilder original = new StringBuilder();
        StringBuilder duplicate = new StringBuilder();

        System.out.println("Given String : String with Duplicate Value : "+strWithDup);
        for (char c :characters){
            if (!found[c]){
                found[c]=true;
                original.append(c);
            }
            else{
                if (!secondfound[c]){
                    secondfound[c]=true;
                    duplicate.append(c);
                }

            }

        }
        System.out.println("String after removing Duplicate : "+original.toString());
        System.out.println("Duplicate values found : "+duplicate.toString());
    }
}
