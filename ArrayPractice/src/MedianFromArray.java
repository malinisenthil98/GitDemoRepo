import org.openqa.selenium.json.JsonOutput;

import java.util.*;

public class MedianFromArray {
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Start enter the Array elements ....");

       while (sc.hasNextInt()){
           alist.add(sc.nextInt());
       }
       sc.close();
        System.out.println("Given Array : "+ alist);
        Collections.sort(alist);
        System.out.println("Sorted Array : "+alist );


        int size = alist.size();
        System.out.println("Size = "+size);
        int pos = size/2;


        if (size%2 == 0){
            System.out.println(alist.get(pos));
            System.out.println(alist.get(pos-1));
            double med = (alist.get(pos)+alist.get(pos-1))/2.0;

            System.out.println("Median of the Given Array : "+med);
        }
        else {

            System.out.println("Median of the Given Array : " + alist.get(pos));
        }
    }
}
