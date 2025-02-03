import java.util.Scanner;
public class ReverseofArray {
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
        reversearray(arr);
       
        sc.close();  



        }
        public static void reversearray(int arr[]){
            int first=0; int last=arr.length-1;
            for(int i=0;i<arr.length;i++){
                while(first<last){
                    int temp=arr[first];
                    arr[first]=arr[last];
                    arr[last]=temp;
                    first++;
                    last--;
                }
    
                
                }
                System.out.print("Reverse array is :- ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }




    }
    

