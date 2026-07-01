// Question : Write a program to find the sum of all even numbers up to N.

class Logic
{
    void sumEvenNumbers(int num)
    {
        int iSum = 0;
        int iCnt = 0;

        if(num < 0)
        {
            num = -num;
        }

        for(iCnt = 0; iCnt <= num; iCnt = iCnt + 2)
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Sum of even numbers up to " + num + " is : " + iSum);

    }
}
class SumOfEvenUptoN
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}