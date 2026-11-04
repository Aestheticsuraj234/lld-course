public class Editor {
    private String text = "";

    public void type(String words) {
        text = text + words;
    }

    public String getText() {
        return text;
    }

    public Snapshot save() {
        return new Snapshot(text);
    }

    public void restore(Snapshot snapshot) {
        text = snapshot.getText();
    }
}