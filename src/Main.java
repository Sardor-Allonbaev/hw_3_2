public class Main {
    public static void main(String[] args) {
        BankAccount visa = new BankAccount();
        visa.deposit(20000.00);
        while (true) {
            try {
                visa.withDraw(6000);
            } catch (LimitException e) {
                try {
                    visa.withDraw((int) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }break;
            }
        }

    }
}