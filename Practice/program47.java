import java.util.Scanner;

class NumberX
{
    public void DisplayFactors(int iNo)
    {
       int iCnt = 0;

       for(iCnt = 1; iCnt <= iNo/2; iCnt++)     // optimization of code factor zo number dilay techa half madhech samoto tr extra loop madhe firnyachi garaz nhi
       {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
       }
    }
}

class program47
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        nobj.DisplayFactors(iValue);
    }
}

// Time Complexity : O(N/2)    how many times loops get run is called time complexity
// where N >= 0