import java.util.*;
public class linear_search {
    public static int searching(int num[],int k)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==k){
                return i;
            }
        }
        return 0;

    }
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println("index of"+m+"is"+ searching(a,m));
    }
}
