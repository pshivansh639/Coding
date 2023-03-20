 import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int c=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                temp=x;
                while (temp!=0){
                    temp=temp/10;
                    c=c+1;
                }
                System.out.print(s1);
                for(int j=0;j<15-s1.length();j++)
                {
                    System.out.print(' ');
                }
                if (c<3 && c!=0){
                    System.out.println("0"+x);
                }
                else if(c==0)
                {
                    System.out.println("000");
                }
                else{
                    System.out.println(x);
                }
                c=0;
            }
            System.out.println("================================");

    }
}
