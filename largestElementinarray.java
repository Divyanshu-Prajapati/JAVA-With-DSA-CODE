import java.util.Scanner;
public class largestElementinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter " +size+" numbers:- ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("you Enter the array is :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.print("Largest number is :- "+largest);


      sc.close();  }
    
}
