public class RunTheApp {

    public static void main(String[] args) {

        for (int i = 0; i < 15 ; i++) {
            Thread thread = new Thread(new Customer());
            thread.setName(String.valueOf(Customers.values()[i]));
            thread.start();
        }

    }

}
