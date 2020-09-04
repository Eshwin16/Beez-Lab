#include <stdio.h>

int main()
{

    int a,b;
    scanf("%d %d",&a,&b);
 
   printf("Original Value :%d %d",a,b);
  
  a=a+b;

    b=a-b;
 
   a=a-b;
  
  printf("\nValue after Swapping:%d %d",a,b);

    
return 0;

}
