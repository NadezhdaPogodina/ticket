public class Main {
    public static void main(String[] args) {
        int account = 100;
        int topup = 1100;
        int bonus = topup / 100;
        int finalaccount = account + topup + bonus;

        if (topup > 1000) {
            System.out.println("bonus = " + bonus);
            System.out.println("final account = " + finalaccount);
        } else {
            System.out.println("bonus = 0");
        }
    }
}
