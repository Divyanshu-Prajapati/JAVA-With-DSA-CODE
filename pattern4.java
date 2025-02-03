import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row :- ");
        int row=sc.nextInt();
        for(int i =1;i<=row;i++){
            for(int j=row-1;j>=i;j--){
                System.out.print("p");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();
        
    }
}
