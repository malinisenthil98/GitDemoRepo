import java.lang.reflect.Array;
import java.util.Scanner;

public class MirrorArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This line is entered as a testing purpose");
        System.out.println("Enter the number of rows of an Array : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of an Array : ");
        int col = sc.nextInt();
        int [][] a=new int[row][col];
        System.out.println("This is line is a part of Git practice");
        int [][] b = new int[row][col];
        System.out.println("Start Entering the Array Values....");
        for (int i = 0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Enter the array Element of ("+(i+1)+" ,"+(j+1)+")");
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for (int i=0;i<row;i++){
            int revCol = 0;
            for (int j=col-1;j>=0;j--){
                int element = a[i][j];
                b[i][revCol]=element;
                revCol++;
            }
        }
        System.out.println("Input Array ");
        ViewArray(a);
        System.out.println("Mirror Array ");
        displayArray(b);
    }
    public static void displayArray(int array[][]){
        for (int i = 0;i<array.length;i++){
            for (int j =0;j<array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void ViewArray(int array[][]){
        for (int i = 0;i<array.length;i++){
            for (int j =0;j<array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
