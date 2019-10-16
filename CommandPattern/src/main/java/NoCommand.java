public class NoCommand implements Command {
    @Override
    public void undo() {

    }

    @Override
    public void execute() {
        System.out.println("do nothing");
    }
}
