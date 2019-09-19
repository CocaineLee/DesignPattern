public class Mocha extends CondimentDecorator {
    Bevrage bevrage;

    public Mocha(Bevrage bevrage) {
        this.bevrage = bevrage;
    }

    @Override
    public String getDescription() {
        return bevrage.getDescription()+"mocha";
    }

    @Override
    public double cost() {
        return bevrage.cost() + 0.2;
    }
}
