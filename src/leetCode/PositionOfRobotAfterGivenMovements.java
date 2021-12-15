package leetCode;

public class PositionOfRobotAfterGivenMovements
{

    public static void main(final String[] args)
    {
        final String s = "UDDLLRUUUDUURUDDUULLDRRRR";
        int u=0,d=0,l=0,r=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                u++;
            } else if(s.charAt(i)=='D'){
                d++;
            } else if(s.charAt(i)== 'L'){
                l++;
            } else if(s.charAt(i)=='R'){
                r++;
            }
        }
        System.out.println((r-l) + " : " + (u-d));

    }

}
