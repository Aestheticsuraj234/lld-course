public class LightThemeFactory implements ThemeFactory{
    public Button createButton(){
        return new LightButton();
    }
}
