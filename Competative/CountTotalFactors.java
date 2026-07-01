// Question : Write a program to count total number of factors of a given number.

class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0;
        int iCount = 0;

        if(num < 0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }

        System.out.println("Total factors are : " +iCount);
        
    }
}

class CountTotalFactors
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}