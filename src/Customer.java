public class Customer extends Thread{

    @Override
    public void run() {
        Cashbox.buy();
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
