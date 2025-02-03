public class SpiralMatrix
{
    public static void main(String[] args) {
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiral(matrix);

}
public static void spiral(int matrix[][]){
    int startrow=0;
    int startcol=0;
    int Endrow=matrix.length-1;
    int Endcol=matrix[0].length-1;
    while(startrow<=Endrow &&startcol<=Endcol){
        //TO print top
        for(int i=startcol;i<=Endcol;i++){
            System.out.print(matrix[startrow][i]+" ");
        }
        //to print Right
        for(int i=startrow+1;i<=Endrow;i++){
            System.out.print(matrix[i][Endcol]+" ");

        }
        // to print bottom
        for(int i=Endcol-1;i>=startcol;i--){
            System.out.print(matrix[Endrow][i]+" ");

        }

        //to print left

        for(int i=Endrow-1;i>=startrow+1;i--){
            System.out.print(matrix[i][startcol]+" ");

        }
        startcol++;
        startrow++;
        Endcol--;
        Endrow--;

    }

}
}