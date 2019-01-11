public class Customer extends Thread{

    @Override
    public void run() {
        Cashbox.buy();
    }

}
