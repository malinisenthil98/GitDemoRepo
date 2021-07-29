public class RemoveDuplicateStringWArray {
    public static void main(String[] args){
        String strWithDup= "Malini Senthilkumar";
        char[] characters = strWithDup.toCharArray();
        int length = characters.length;
        for (int i =0;i<length;i++){
            for (int j =i+1;j<length;j++){
                if (characters[i]==characters[j]){
                    int temp = j;
                    for (int k=temp;k<length-1;k++){
                        characters[k]=characters[k+1];
                    }
                    j--;
                    length--;
                }
            }
        }
        System.out.println("String with Duplicate : "+strWithDup);
        String strWithoutDup = new String(characters);
        strWithoutDup=strWithoutDup.substring(0,length);
        System.out.println("String without Duplicate : "+strWithoutDup);
    }
}
