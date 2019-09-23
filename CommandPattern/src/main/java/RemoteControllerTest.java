public class RemoteControllerTest {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteController.setSlot(lightOnCommand);
        remoteController.pressBtn();
    }


}
