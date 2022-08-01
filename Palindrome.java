import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int temp=n;
        int a;
        int res=0;
        while(n!=0)
        {
            a=n%10;
            res=a+(res*10);
            n=n/10;

        }
        if(temp==res)
        {
            System.out.println("palindrome");

        }
        else{
            System.out.println("not palindrome");


        }
    }
}
