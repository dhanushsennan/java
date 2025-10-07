import java.util.Scanner;
class Calculator
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice \n1.add \n2.mul \n3.div \n4.sub");

int choice=sc.nextInt();
switch (choice)
{
case 1:
{
System.out.println("enter your first number");
int a=sc.nextInt();
System.out.println("enter your second number");
int b=sc.nextInt();
int res=a+b;
System.out.println("resul is:"+res);
}
break;

case 2:
{
System.out.println("enter your first number");
int a=sc.nextInt();
System.out.println("enter your second number");
int b=sc.nextInt();
int res=a-b;
System.out.println("resul is:"+res);
}
break;

case 3:
{
System.out.println("enter your first number");
int a=sc.nextInt();
System.out.println("enter your second number");
int b=sc.nextInt();
int res=a*b;
System.out.println("resul is:"+res);
}
break ;

case 4:
{
System.out.println("enter your first number");
int a=sc.nextInt();
System.out.println("enter your second number");
int b=sc.nextInt();
int res=a/b;
System.out.println("resul is:"+res);
}
break;

default:
{
System.out.println("invoild choice");
}
}
}
}