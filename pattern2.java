import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of line :- ");
        int inputline=sc.nextInt();
        for(int i =0;i<inputline;i++){
            for(int j=inputline-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
