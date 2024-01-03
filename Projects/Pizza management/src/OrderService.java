import java.util.Scanner;

public class OrderService {
    public void order() {

        Receipt receipt = new Receipt();

        Scanner scanner = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println("[1] -> Italiano  \n" + "[2] -> Americano\n" + "[3] -> Mexicano\n" + "[4] -> Chicken Kickers\n" + "[5] -> Margherita\n" + "[6] -> Pepperoni" + "Chose one option : ");

        int optionOfPizza = scanner.nextInt();

        switch (optionOfPizza) {
            case 0:
                totalPrice += 12;
                receipt.setPizza("Italiano");
                break;
            case 1:
                totalPrice += 11;
                receipt.setPizza("Americano");
                break;
            case 2:
                totalPrice += 13;
                receipt.setPizza("Mexicano");
                break;
            case 3:
                totalPrice += 10;
                receipt.setPizza("Chicken Kickers");
                break;
            case 4:
                totalPrice += 14;
                receipt.setPizza("Margherita");
                break;
            case 5:
                totalPrice += 15;
                receipt.setPizza("Pepperoni");
                break;
        }

        System.out.println("[1] -> Small  \n" + "[2] -> Medium\n" + "[3] -> Large\n" + "Chose one option : ");

        int optionOfSize = scanner.nextInt();

        switch (optionOfSize) {
            case 0:
                totalPrice += 0;
                receipt.setSize("Small");
                break;
            case 1:
                totalPrice += 7;
                receipt.setSize("Medium");
                break;
            case 2:
                totalPrice += 14;
                receipt.setSize("Large");
                break;
        }

        System.out.println("[1] -> Ketcup  \n" + "[2] -> Barbecu\n" + "[3] -> Mayonnaise\n" + "[4] -> Cancel\n" + "Chose one option : ");

        int optionOfSous = scanner.nextInt();

        switch (optionOfSous) {
            case 0:
                totalPrice += 7;
                receipt.setSous("Ketcup");
                break;
            case 1:
                totalPrice += 7;
                receipt.setSous("Barbecu");
                break;
            case 2:
                totalPrice += 7;
                receipt.setSous("Mayonnaise");
                break;
            case 3:
                totalPrice += 0;
                receipt.setSous("Cancel");
                break;
        }

        System.out.println("Total price : " + totalPrice);
        receipt.setPrice(totalPrice);

        paymemt(receipt);
    }

    public void paymemt(Receipt receipt) {

        System.out.println("[1]--> Cancel : ");
        System.out.println("[2]--> Order : ");
        System.out.println("Your option : ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();


        switch (option) {
            case 1:
                order();
                break;
            case 2:
                if (receipt.getPrice() < GlobalValues.currentCustomer.getBalance()) {
                    System.out.println("Order successfully");
                    showreceipt(receipt);

                } else {
                    System.out.println("The amount is insufficient");
                }
                break;
        }
    }

    public void showreceipt(Receipt receipt) {
        System.out.println("Pizza" + receipt.getPizza());
        System.out.println("Size" + receipt.getSize());
        System.out.println("Sous" + receipt.getSous());
        System.out.println("Total price" + receipt.getPrice());
    }
}