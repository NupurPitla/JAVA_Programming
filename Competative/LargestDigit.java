// Question : Write a program to find the largest digit in a given number.

class Logic
{
    void findLargestDigit(int num)
    {
        int digit = 0;
        int max = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            digit = num % 10;

            if(digit > max)
            {
                max = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit is : " + max);
    }
}
    
class LargestDigit
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}