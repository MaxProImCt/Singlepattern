public class Sigelton {

    private static Sigelton unique;
    private static int counter = 0;

    private Sigelton()
    {
        System.out.println("Instance of Sigelton has been created: " + (counter+1) + "  times");
        counter++;
    }

    public static synchronized Sigelton getInstance(int n)
    {
        if(unique == null || counter < n)
        {
            unique = new Sigelton();
        }
        return unique;
    }
}