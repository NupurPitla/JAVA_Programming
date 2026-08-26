// first write the code in flag for interview then when asked the other code for prime
// function is going to return boolean then only we can use the flag

import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
       int iCnt = 0;        // factors
       boolean bFlag = true;                           // intialized with 1 i.e true

       for(iCnt = 2; iCnt <= iNo/2; iCnt++)     
       {
            if((iNo % iCnt) == 0)
            {
                 bFlag = false;
                 break;
            }
       }
            return bFlag;
    }
}

class program68
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
             System.out.println("It is prime");
        }
        else
        {
            System.out.println("It is not prime");
        }
    }
}
