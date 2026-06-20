// Question : Write a program to check whether a number is prime or not.

class Logic
{
    void checkPrime(int iNo)
    {
        int iCnt = 0;        // factors

       for(iCnt = 2; iCnt <= iNo/2; iCnt++)     
       {
            if((iNo % iCnt) == 0)
            {
                break;
            }
       }

       if(iCnt >= (iNo/2)+1)
       {
           System.out.println("The number is prime\n");
       }
       else
       {
            System.out.println("The number is not prime\n");
       }

    }
}

class CheckPrime
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}