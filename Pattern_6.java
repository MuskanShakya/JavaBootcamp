public class Pattern_6 {
    public static void main(String[] args)
    {

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=(5-i)*2;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(" "+k);
            }
            for(int m=2;m<=i;m++)
            {
               System.out.print(" "+m);
            }
                System.out.println();

        }
    }
}
