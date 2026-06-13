// Type 3      bussiness logic sathi navin class tayar karto

import java.util.Scanner;

class NumberX
{
    public static boolean CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0)&&(iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
}

class program44
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        bRet = NumberX.CheckDivisible(iValue);     // Number cha object nhi create kela karan class NumberX madhe main static ahe

        if(bRet == true)
        {
            System.out.println("Number is divisible by 3 & 5");
        }  
        else
        {
             System.out.println("Number is not divisible by 3 & 5");
        }
    }
}