public class RemoveDuplicateWJavaStream {
    public static void main(String[] args){
        String strWithDup = "Malini Senthilkumar";
        System.out.println("String with Duplicate : " +strWithDup);
        StringBuffer strbuild = new StringBuffer();
        strWithDup.chars().distinct().forEach(k->strbuild.append(k));
        String strWithoutDup = strbuild.toString();

        System.out.println("String without Duplicate : "+strWithoutDup);
    }
}
