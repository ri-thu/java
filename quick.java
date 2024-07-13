import java.util.*;
class sort
{
   
    void quicksort(String a[],int l,int h)
    {
        int i,j;
        String pivot,temp;
        if(l<h)
        {
            i=l;
            j=h;
            pivot=a[l];
            while(i<j)
            {
                while((a[i].compareTo(pivot)<=0)&&(i<h))
                {
                    i++;
                }
                while((a[j].compareTo(pivot)>=0)&&(j>l))
                {
                    j--;
                }
                if(i<j)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
            temp=a[j];
            a[j]=a[l];
            a[l]=temp;
            this.quicksort(a,l,j-1);
            this.quicksort(a,j+1,h);
        }
    }

}
class quick
{
    public static void main(String[] args)
    {
        String a[]=new String[15];
        int n,i;
        Scanner sc=new Scanner(System.in);
        sort q=new sort();
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the names into the array");
        for(i=0;i<=n;i++)
        {
            a[i]=sc.nextLine();
        }     
        System.out.println("Array before sorting");
        for(i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }
        q.quicksort(a,0,n);
        System.out.println("Array after sorting");
        for(i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }
    }
}