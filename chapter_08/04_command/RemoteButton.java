// The button only knows "run the command". It doesn't know about lights.
public class RemoteButton {
    private Command command;

    public RemoteButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}