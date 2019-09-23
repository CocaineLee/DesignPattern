public class RemoteController {
    Command slot;

    public RemoteController() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void pressBtn() {
        slot.execute();
    }
}
