#include <stdio.h>
#include <conio.h>
int main()
{
    int n,temp,i,j,a[10];
    printf("Enter array size:\n");
    scanf("%d",&n);
    for(int i=0; i<n; i++)
     {
         printf("Enter array elements %d:",i+1);
         scanf("%d",&a[i]);
     }
     for(int i=0; i<(n-1);i++)
      {
         for(int j=0; j<(n-i-1); j++)
          {
             if(a[j]>a[j+1])
             {
                 temp= a[j];
                 a[j]=a[j+1];
                 a[j+1]= temp;
             }
          }
      }
      printf("Elements in ascending order:\n");
      for(i=0; i<n; i++)
       {
         printf("%d",a[i]);
         printf("\n");
       }
    for(i=0;i<(n-1);i++)
{
for(j=0;j<(n-i-1);j++)
{
if(a[j]<a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;}
}
}
printf("Array element in descending order:\n");
for(i=0; i<n; i++)
 {
     printf("%d",a[i]);
     printf("\n");
 }
    getch();
}