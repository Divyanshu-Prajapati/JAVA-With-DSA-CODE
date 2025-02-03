public class reveseofnumber{
    public static void main(String[] args) {
        int a=1234;
        reverse(a);

    }
    public static void reverse(int a ){
        int temp=a;
        
        int rev=0;
        while(a>0){
        int last=a%10;
        rev=(rev*10)+last;
        a=a/10;

        }
        


        System.out.println("The reverse of "+temp+" is :- "+rev);


    }
    


}