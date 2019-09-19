public class StarBuzzCoffee {
    public static void main(String args[]) {
        Bevrage bevrage = new Espresso();
        System.out.println("des:" + bevrage.getDescription() + "cost:" + bevrage.cost());
        Bevrage bevrage1 = new HouseBlend();
        System.out.println("des:" + bevrage1.getDescription() + "cost:" + bevrage1.cost());

        bevrage1 = new Mocha(bevrage1);
        System.out.println("des:" + bevrage1.getDescription() + "cost:" + bevrage1.cost());


    }
}
