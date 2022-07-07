public class PrimeNumbers {
    public static void main(String[] args)
    {
        int f=0;
        for(int i=1;i<=10;i++)
        {
            int p=1;
            for(int j=2;j<i;j++)
            {
               if(i%j==0)
               {
                   p=0;

               }

            }
            if(p==1)
            {
                System.out.print(i+" ");

            }
        }
    }
}
