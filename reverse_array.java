import java.util.*;
public class reverse_of_an_array {
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        int i;
        int k=n-1;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            arr2[i]=arr[k];
            k--;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }

        
    
}
