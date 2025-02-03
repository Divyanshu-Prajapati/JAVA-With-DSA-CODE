import java.util.Scanner;
public class Diagonalmatrixsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the no of rows :- ");
        int row=sc.nextInt();
        System.out.print("Enter the no of column :- ");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("Enter the element of 2D array :- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter the element at position  ("+i+","+j+") :- ");
                matrix[i][j]=sc.nextInt();

            }
        }
        //for print the 2D array is: 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        Diagonalsum(matrix,row,col);

    }
    public static void Diagonalsum(int matrix[][],int row,int col){
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                     sum+=matrix[i][j];
                    //  System.out.print(sum);
                    //  System.out.println();

                }
                else if(i+j==matrix.length-1){
                    sum=sum+matrix[i][j];
                
                }
            }
        }
        System.out.print("Diagonal sum is :- "+sum);
        System.out.println();

    }
}
