// Question : Write a program to find the smallest digit in a given number.

class Logic
{
    void findSmallestDigit(int num)
    {
        int digit = 0;
        int min = num;

        if(num < 0)
        {
            num = -num;
        }

        while(num > 0)
        {
            digit = num % 10;

            if(digit < min)
            {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest digit is : " + min);
    }
}

class SmallestDigit
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}