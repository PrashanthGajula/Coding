package gs;

public class CarRent
{

    public static void main(final String[] args)
    {
        final int[][] car = {{1,2,10},{2,4,30},{4,8,25}};
         int maxRent=0;
 int[] n = new int[car[0].length];
        for(int i=0;i<car.length;i++){
            final int rent = car[i][2]/(car[i][1]-car[i][0]);
            if(maxRent < rent){
                maxRent = rent;
                n = car[i];
            }
        }
System.out.println(n[0] + " "+n[1]+" "+n[2]);
    }

}
