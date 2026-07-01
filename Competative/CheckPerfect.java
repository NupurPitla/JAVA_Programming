// Question : Write a program to check whether a number is a perfect number or not.

class Logic
{
    void checkPerfect(int num)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == num)
        {
            System.out.println(num + " is a Perfect Number");
        }

        else
        {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}
class CheckPerfect
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}