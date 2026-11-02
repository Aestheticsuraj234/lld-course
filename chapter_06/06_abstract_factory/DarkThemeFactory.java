public class DarkThemeFactory implements ThemeFactory{
    public Button createButton(){
        return new DarkButton();
    }
}
