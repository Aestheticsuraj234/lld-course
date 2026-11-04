public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        RemoteButton onButton = new RemoteButton(new LightOnCommand(light));
        RemoteButton offButton = new RemoteButton(new LightOffCommand(light));

        onButton.press();
        offButton.press();
    }
}