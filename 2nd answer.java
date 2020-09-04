import java.util.*;
public class Hello{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int array[]=sc int[a];
for(int index=0;index<a;index++)
{
array[index]=sc.nextInt();
}
int val=(a+1)*(a+2)/2;
for(int index=0;index<a;index++)
{
val-=array[index];
System.out.println(val);
}
}