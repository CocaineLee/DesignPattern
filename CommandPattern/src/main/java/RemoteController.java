public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public RemoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setSlot(int slotIndex,Command onCommand,Command offCommand) {
        offCommands[slotIndex] = offCommand;
        onCommands[slotIndex] = onCommand;
    }

    public void pressOnBtn(int slotIndex) {
        onCommands[slotIndex].execute();
        lastCommand = onCommands[slotIndex];
    }

    public void pressOffBtn(int slotIndex) {
        offCommands[slotIndex].execute();
        lastCommand = offCommands[slotIndex];
    }

    public void pressUndoBtn() {
        lastCommand.undo();
    }

}
