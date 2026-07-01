// Question : Write a program to display all factors of a given number.

class Logic
{
    void displayFactors(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        System.out.print("Factors are : ");

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

class DisplayFactors
    {
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}