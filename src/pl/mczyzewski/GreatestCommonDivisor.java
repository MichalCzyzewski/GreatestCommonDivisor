package pl.mczyzewski;

public class GreatestCommonDivisor
{

    public static int getGreatestCommonDivisor(int first, int second)
    {
        int div = 1;
        int GreatestComDiv =0 ;


       if(first < 10 || second < 10)
       {
           return -1;
       }

       while ((first%div < first)||(second%div<second))
       {div++;
           if ((first%div ==0 ) && (second%div ==0 )){
            GreatestComDiv = div;
           }



       }


        return GreatestComDiv;
            }

}
