class Armstrong_num
{
public static void main(String args[])
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
int a=n;
int sum=0;
while(n!=0)
{
int r=n%10;
SUM=r*r*r;
n/=10;
}
if(sum==a)
{
System.out.println("Number "+a+ is a armstrong number);
}else

{
System.out.println("Number "+a+ is not a armstrong number);
}
}
}