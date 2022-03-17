public class PowerOf {
    private static int num1;
    private static int num2;

    public PowerOf(int num1, int num2)
    {

        this.num1 = num1;
        this.num2 = num2;
    }


    public static int power()
    {
        int result;
        result = 1;
        for(int i = 0;i<num2;i++)
        {
         result *=num1;
        }

        return result;
    }
}
