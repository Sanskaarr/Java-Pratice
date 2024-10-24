public class lcm {
    public static void main(String[] args){
    int  n=10;
    int n2=2,mul=1;
    for (int j=1;j<=n;j++)
    {
        System.out.println(j);
        while(n2<=n)
        {
            if (j%n2==0)
            {
                mul=mul*n2;
                j=j/n2;
                System.out.println(mul);

            }
            else{
                n2++;
                System.out.println(mul);
                  }
        }
    }
    
    
}}
