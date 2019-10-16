public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
