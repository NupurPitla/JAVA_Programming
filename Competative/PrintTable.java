// Question : Write a program to print the multiplication table of a number.

class Logic
{
    void printTable(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
        iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println((iNo * iCnt) +"\t");
        }

        System.out.println();
    }
}

class PrintTable
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        obj.printTable(5);
    }
}
