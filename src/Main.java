public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
/*
        int[] drinkPrices = {150, 80, 20, 30};
        String[] drinkNames = {"Cappuccinos", "Americano", "Water", "Milk"};

        System.out.print("Please enter currency value - ");
        int moneyAmount = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            moneyAmount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value !");
        }

        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkPrices, drinkNames);
        coffeeMachine.checkPrices(moneyAmount);


        //TODO Exceptions

        //---------------------------------------------------------
        int[] drinkPrices = {150, 80, 20, 30};
        System.out.println("BEFORE");

        try {
            System.out.println(drinkPrices[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred !");
            e.printStackTrace();
        }

        System.out.println("AFTER");

        //---------------------------------------------------------
        try {
            FileReader reader = new FileReader("/home/ezhik/Desktop/SL.pdf");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        //---------------------------------------------------------


        //TODO Multithreading

        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);

        thread1.start();
        thread2.start();


        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        try {
            InputStream in = new FileInputStream("/home/ezhik/Desktop/2020.09.01_14:11:58.png");
            client.files().uploadBuilder("/2020.09.01_14:11:58.png").uploadAndFinish(in);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

 */
    }
}
