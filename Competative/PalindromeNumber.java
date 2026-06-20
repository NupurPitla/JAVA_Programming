// Question : Write a program to check whether a number is a palindrome or not.

class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = num;

         while (num != 0)
        {
             iDigit = num % 10;
             iRev = (iRev * 10) + iDigit;
             num = num / 10;
        }

        if(iRev == iTemp)
        {
           System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }

}

class PalindromeNumber
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        
        obj.checkPalindrome(121);
    }
}