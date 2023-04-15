import java.util.*;
public class sentinelsearching {
    public static void main(String args[])
    {
        int i,n,k;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        k=obj.nextInt();
        System.out.println("index is "+sentinelsearch(a,n,k));
    }
    public static int sentinelsearch(int num[],int len,int key)
    {   
        int last=num[len-1];
        num[len-1]=key;
        int i=0;
        while(num[i]!=key)
        {
            i++;
        }
        num[len-1]=last;
        if(i<len-1 || num[len-1]==key){
            return i;
        }
        else{
            return -1;
        }
        
    }
}
