public class Main {
    public static void main(String[] args) {
        /*
        int[] drinkPrices = {150, 80, 20, 30};
        String[] drinkNames = {"Cappuccinos", "Americano", "Water", "Milk"};

        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkNames, drinkPrices);
        CoffeeMachine.checkPrice(120);
    }

         */
        int[] drinkPrices = {150, 80, 20, 30};
        System.out.println("BEFORE");

        try {
            System.out.println(drinkPrices[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured !");
        }

        System.out.println("AFTER");


    }
}
