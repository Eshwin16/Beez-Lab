public class MyClass{
public static void main(String args[]){
String str="Beez Innovation Labs is also called as BeezLabs is with the vision to bring Business and technology together by empowering people to create digital future";
int count=0;
for(int index=0;index<str.length();index++)
{
char c=str.charAt(index);
if(c>='a'&&c<='z' ||c>='A' && c<='Z')
{
count++;
}
}
System.out.println(count);
}
}