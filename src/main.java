import java.util.Scanner;

public class main {
    static int instances = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many instances do you want to create? : ");
        instances = scan.nextInt();

        for (int i = 0; i < 50; i++) {
            Thread t = new Thread(new MessageLoop());
            t.start();
        }
    }

    private static class MessageLoop implements Runnable {

        public void run()
        {
            for(int i =  0 ; i < instances ; i++)
            {
                Sigelton.getInstance(instances);
            }
        }
    }
}