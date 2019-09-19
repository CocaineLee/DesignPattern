public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "veggie":
                pizza = new NYVeggiePizza();
                break;
            default:
                break;
        }

        return pizza;
    }
}
