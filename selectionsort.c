#include <stdio.h>
#include <conio.h>
void selection_sort(int[],int);
void main()
{
    
}
void selection_sort(int a[],int n)
{
    int i,j,k,temp;
    printf("\nUnsorted data");
    for(k=0;k<n;k++)
    {
        printf("%5d",a[k]);
    }
    for(i=0;i<n;i++)
    {
        k=i;
        for(j=i+1;j<n;j++)
        {
            if(a[j]<a[k])
            {
                k=j;
                if(k!=i)
                {
                    temp=a[i];
                    a[i]=a[k];
                    a[k]=temp;
                }
            }
        }
    }
    printf("\n Sorted data:");
    for(k=0;k<n;k++)
    {
        printf("%5d",a[k]);
    }
    getch();
}