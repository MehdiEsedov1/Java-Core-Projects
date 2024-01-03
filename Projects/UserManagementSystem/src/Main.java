import Management.MenuSelectors;
import Management.Menus;

public class Main {
    public static void main(String[] args) {
        while (true) {
            MenuSelectors menuSelectors = new MenuSelectors();

            Menus.showMainMenu();
            menuSelectors.mainMenuSelector();
        }
    }
}