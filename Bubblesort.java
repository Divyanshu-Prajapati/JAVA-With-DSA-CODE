import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size =sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter "+size+" number :- ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("You entered the array is :- ");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);

        }
        Bubble(arr);
        sc.close();


        
    }
    public static void Bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.print("Sorted array is :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);


    }
   
    
}
}
