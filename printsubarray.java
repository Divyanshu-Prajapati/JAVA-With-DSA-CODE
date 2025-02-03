import java.util.Scanner;
public class printsubarray {
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
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print(arr[k]+ " ");

                }
                System.out.println();

            }

            
            }
            sc.close();
        }


    }
    

