public class Main {
    public static void main(String[] args) {
        ThemeFactory factory = new DarkThemeFactory();

        Button button = factory.createButton();

        button.show();
    }
}
