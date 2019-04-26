package pl.mczyzewski;

public class GreatestCommonDivisor
{

    public static int getGreatestCommonDivisor(int first, int second)
    {

        if (first < 10 || second < 10)
        {
            return -1;
        }

        int greComDivFir = 0;
        int greComDivSec = 0;
        int x=0;

        while (x <=first)
        {
         greComDivFir = first % x;
         if (greComDivFir == 0)
         {
             return greComDivFir;
         }
         x++;
        }

        while (x <=second)
        {
            greComDivFir = second % x;

            if (greComDivFir == 0)
            {
                return greComDivSec;
            }
            x++;
        }

return greComDivFir;
    }

}
