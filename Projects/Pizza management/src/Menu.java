public class Menu implements ProjectInterface.Menu {
    public void showMainMenu() {

        MenuSelector menuSelector = new MenuSelector();

        System.out.println(
                "[0]-->Exit\n" +
                        "[1]-->Show admin menu\n" +
                        "[2]-->Show customer menu\n" +
                        "Chose a option : "
        );
        menuSelector.mainMenu();
    }

    public void showAdminMenu() {

        MenuSelector menuSelector = new MenuSelector();

        System.out.println(
                "[0]-->Exit\n" +
                        "[1]-->Back\n" +
                        "[2]-->Add courier\n" +
                        "[3]-->Track orders\n" +
                        "[4]-->View couriers\n" +
                        "[5]-->View customers\n" +
                        "Chose a option : "
        );
        menuSelector.adminMenu();
    }

    public void showCustomerRegistrationMenu() {

        MenuSelector menuSelector = new MenuSelector();

        System.out.println(
                "[0]-->Exit\n" +
                        "[1]-->Log in\n" +
                        "[2]-->Sign up\n" +
                        "[3]-->Back\n" +
                        "Chose a option : "
        );
        menuSelector.customerRegistrationMenu();
        showCustomerMenu();
    }

    public void showCustomerMenu() {

        MenuSelector menuSelector = new MenuSelector();

        System.out.println(
                "[0]-->Exit\n" +
                        "[1]-->Back\n" +
                        "[2]-->Place order\n" +
                        "[3]-->Track order\n" +
                        "[4]-->Cancel order\n" +
                        "Chose a option : "
        );
        menuSelector.customerMenu();
    }
}