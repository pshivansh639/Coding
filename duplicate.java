class duplicate_or_not {
  
    public static void main(String args[])
    {
        int numRay[] = { 0, 4, 3, 7, 8, 2, 1 };
        int c=0;
        int d=0;
        for(int i=0;i<numRay.length;i++)
        {
            for(int j=0;j<numRay.length;j++)
            {
                if(numRay[i]==numRay[j])
                {
                    c++;
                }
                
            }
            d++;
            if(c>=2)
                {
                    System.out.println("it contains duplicate");
                    
                    break;
                    
                }
                
            c=0;
        }
        if(d==numRay.length)
        {
            System.out.println("not contains duplicate");
        }
        
    }
}
