import java.util.*;
public class Main
{
public static int clock(int h,int m)
{
int value=(int)(h*60+m)*0.5);
int ang=(m*6)-value;
if(ang<0)
ang=-ang;
return Math.min(360-ang,ang);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String[] array=sc.nextLine().split(":");
int h=Integer.valueOf(array[0],m=Integer.valueOf(array[1]);
if(m==30)
System.out.print("90 degrees");
else if(m==0)
System.out.print("180 degrees");
else
Syetem.out.print(clock(h,m)+"degrees");
}
}