public class Pattern_4 {
    public static void main(String[] args)
    {

        for(int i=1;i<=5;i++)
        {
            for(int k=6;k>i;k--)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
