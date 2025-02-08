import java.util.Scanner;
public class Stringlength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:- ");
        // In String length is a fuction but in array length is a property--
        String name=sc.nextLine();
        System.out.print("Your string is :- "+name);
        System.out.println();
        System.out.print("Size of String is :- "+name.length());
        sc.close();


        
    }
}
