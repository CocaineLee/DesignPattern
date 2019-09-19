public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "veggie":
                pizza = new ChicagoVeggiePizza();
                break;
            default:
                break;
        }
        return pizza;
    }


}
