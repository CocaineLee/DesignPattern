public class RemoteControllerTest {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteController.setSlot(0, lightOnCommand, lightOffCommand);
        remoteController.setSlot(1,garageDoorOpenCommand,garageDoorCloseCommand);

        remoteController.pressOnBtn(0);
        remoteController.pressOnBtn(1);
        remoteController.pressOffBtn(0);
        remoteController.pressOffBtn(1);
    }

}
