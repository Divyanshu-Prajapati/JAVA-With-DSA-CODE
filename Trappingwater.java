import java.util.Scanner;
public class Trappingwater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Your array is :- ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");


        }
        System.out.println();
        int l=arr.length;

        int left[]=new int[l];
        int rigth[]=new int [l];
        left[0]=arr[0];
        for(int k=1;k<arr.length;k++){
            left[k]=Math.max(left[k-1],arr[k]);
        }
        rigth[l-1]=arr[l-1];
        for(int m=l-2;m>=0;m--){
            rigth[m]=Math.max(rigth[m+1],arr[m]);
        }
        System.out.print("Rigth array is:- ");
        for(int i=0;i<rigth.length;i++){
            System.out.print(rigth[i]+" ");  
    }
    System.out.println();
    System.out.print("Left array is:- ");
        for(int i=0;i<left.length;i++){
            System.out.print(left[i]+" ");

        
    }
    System.out.println();
    int Trappedwater=0;
    for(int i=0;i<arr.length;i++){
        int Waterlevel=Math.min(rigth[i],left[i]);
        Trappedwater=(Waterlevel-arr[i])+Trappedwater;

        
    }
    System.out.print("Total trapped water is:- "+Trappedwater+ " units");

sc.close();
}
}