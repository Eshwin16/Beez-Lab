import java.util.*;
public class MyClass{
public static int sum(int a)
{
int sum=0;
while(a>0)
{
sum+=(a%10);
a/=10;
}
return sum;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
boolean flag=false;
String str=""+a;
if(str.length()==1)
{
System.out.print(a);
System.exit(0);
}
while(a>0)
{
count=sum(a);
String st=""+count;
if(st.length()==1)
{
System.oit.print(count);
break;
}
else
{
a=count;
}
}
}
}