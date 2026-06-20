// Question : Write a program to find the sum of even and odd digits separately in a number.

class Logic
{
    void sumEvenOddDigits(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(num > 0)
        {
            iDigit = num % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit; 
            }

            num = num / 10;
        }

        System.out.println("Sum of even didgits in the number is:"+iEvenSum);
        System.out.println("Sum of odd didgits in the number is:"+iOddSum);

    }
}

class SumOfEvenOddDigits
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}