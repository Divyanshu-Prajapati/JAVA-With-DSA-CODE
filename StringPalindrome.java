import java.util.Scanner;
public class StringPalindrome{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String word;
        System.out.print("Enter word for Check Palindrome :- ");
        word=sc.nextLine();
        System.out.print("You Entered :- "+ word);
        System.out.println();
        System.out.print("The length of word is  :- "+word.length());
        System.out.println();
       
       
        sc.close();
        Checkpalindrome(word);
        System.out.println(Checkpalindrome(word));

    }
    public static boolean Checkpalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                return false;
                
            }
           
            
                
            
        }
        return true;

    }
}