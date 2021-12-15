package leetCode;

public class SpiralMatrix
{

    public static void main(final String[] args)
    {
        final int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rowBegin = 0;
        int rowEnd = m.length-1;
        int colBegin = 0;
        int colEnd = m[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){

            for(int i=colBegin;i<=colEnd;i++){
                System.out.println(m[rowBegin][i]);
            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                System.out.println(m[i][colEnd]);
            }
            colEnd--;

            if(colEnd>=colBegin){
                for(int i=colEnd;i>=colBegin;i--){
                    System.out.println(m[rowEnd][i]);
                }
            }
            rowEnd--;
            if(rowEnd>=rowBegin){
                for(int i=rowEnd;i>=rowBegin;i--){
                    System.out.println(m[i][colBegin]);
                }
            }
            colBegin++;
        }

    }

}
