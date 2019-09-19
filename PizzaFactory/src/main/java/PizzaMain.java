public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore nyPizzaStore = new NYPizzaStore();


        Pizza pizza;
        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = nyPizzaStore.orderPizza("veggie");
        System.out.println(pizza.getName());
        
    }
}