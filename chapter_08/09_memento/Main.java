import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Stack<Snapshot> history = new Stack<>();

        editor.type("Hello");
        history.push(editor.save());     // save before changing

        editor.type(" World");
        System.out.println("Now: " + editor.getText());

        editor.restore(history.pop());   // undo
        System.out.println("After undo: " + editor.getText());
    }
}

// Now: Hello World
// After undo: Hello