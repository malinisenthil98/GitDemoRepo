import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
      int[] arr = {13,12,5,9,98,27};
        System.out.print("Given Array : ");
    Arrays.stream(arr).forEach(s->System.out.print(s+"\t"));
        System.out.println();
      Arrays.sort(arr);
        System.out.print("Sorted Array : ");
        Arrays.stream(arr).forEach(s->System.out.print(s+"\t"));
      int key = 13;
      int pos = binarySearch(arr,key);
      if (pos != -1){
          System.out.println("Element found at the position "+(pos+1));
      }

    }
    public static int binarySearch(int[] arr,int element){
        int startIndex = 0;
        int endIndex = arr.length-1;
        while(startIndex<endIndex) {
            int midElement = (startIndex + endIndex) / 2;
            if (arr[midElement] == element) {
                return midElement;
            }
            if (arr[midElement]<element){
                startIndex = midElement+1;
            }
            else
                endIndex = midElement-1;
        }
        return -1;
    }
}
