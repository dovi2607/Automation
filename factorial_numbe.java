class factorial_number
{
public static void main(String args[])
{

java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.next/int();
int fact=1;
for (int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("The factorial of "+n+" is "+fact);
}
}