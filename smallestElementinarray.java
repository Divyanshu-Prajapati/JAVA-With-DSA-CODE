import java.util.Scanner;
public class smallestElementinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ize of array :- ");
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
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.print("Smallest number is :- "+smallest);


      sc.close();  
    }
    
}
