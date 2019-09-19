public abstract class Bevrage {
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
