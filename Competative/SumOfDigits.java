// Question : Write a program to find the sum of digits of a number.

class Logic
{
    void sumOfDigits(int num)
    {
       int iSum = 0;

         while (num != 0)
        {
             iSum = iSum + num % 10;
             num = num / 10; 
        }
        System.out.println("Sum of digits of a number is :"+iSum);
    }
}

class SumOfDigits
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        
        obj.sumOfDigits(1234);
    }
}