public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getParol() {
        return parol;
    }

    public void setParol(int parol) {
        this.parol = parol;
    }

    private String name;
    private String surname;
    private int balance;
    private int parol;
}