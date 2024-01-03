package Management;

public class Menus {
    public static void showMainMenu() {
        System.out.println("---------------------------\n" +
                "[0]-->Exit" +
                "\n[1]-->Registration for user" +
                "\n[2]-->Registration for admin" +
                "\nYour option :" +
                "\n---------------------------");
    }

    public static void showUserMenu() {
        System.out.println("---------------------------\n" +
                "[0]-->Exit" +
                "\n[1]-->Show my datas" +
                "\n[2]-->Update your datas" +
                "\n[3]-->Log out" +
                "\nYour option :" +
                "\n---------------------------\n");
    }

    public static void showAdminMenu() {
        System.out.println("---------------------------\n" +
                "[0]-->Exit" +
                "\n[1]-->Show all users" +
                "\n[2]-->Kick user" +
                "\n[3]-->Update your datas" +
                "\nYour option :" +
                "\n---------------------------\n");
    }
}