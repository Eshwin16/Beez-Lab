import java.util.*;
public class Hello{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
for(int index=1;index<=a;index++)
{
String str=String.valueof(index);
char c[]=str.toCharArray();
for(Character q:c)
{
if(q=='1')
{
count++;
}
}
}
System.out.print(count);
}
}
