public class Q3
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int cpt = 1; cpt <= n; cpt++)
        {
            for (int cpt2 = 1; cpt2 <= cpt; cpt2++)
            {
                System.out.print(cpt2 + " ");
            }

            System.out.println();
        }
    }
}