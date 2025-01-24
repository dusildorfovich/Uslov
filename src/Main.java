public class Main {
    public static void main(String[] args) {
        int mobileAccount = 0;
        int addFunds = 1100;
        if (addFunds > 1000) {
            int bonus = addFunds / 100;
            System.out.println(bonus);
            System.out.println(mobileAccount + addFunds + bonus);
        } else System.out.println(mobileAccount + addFunds);
    }
}