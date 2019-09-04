public class MallarDuck extends Duck {
    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("i am a real mallard duck");
    }
}
