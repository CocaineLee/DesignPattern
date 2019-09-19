public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("preparing~~~~");
        System.out.println("add" + dough);
        System.out.println("add" + sauce);
    }

    public void bake() {
        System.out.println("baking~~~~~~");
    }

    public String getName() {
        return name;
    }
}
