import java.util.ArrayList;

public class Cashbox{

    private String number;
    private boolean isFree;

    public Cashbox(String number, boolean isFree) {
        this.number = number;
        this.isFree = isFree;
    }

    public String getNumber() {
        return number;
    }


    public boolean isFree() {
        return isFree;
    }

    synchronized public void setFree(boolean free) {
        isFree = free;
    }


    static ArrayList<Cashbox> cashboxCreated(){
        ArrayList<Cashbox> cashboxes = new ArrayList<>();
        Cashbox cashbox1 = new Cashbox("1", true);
        Cashbox cashbox2 = new Cashbox("2", true);
        Cashbox cashbox3 = new Cashbox("3", true);
        cashboxes.add(cashbox1);
        cashboxes.add(cashbox2);
        cashboxes.add(cashbox3);

        return cashboxes;
    }

    static ArrayList<Cashbox> cashboxes = cashboxCreated();



    public static void buy(){
        while (true) {
            for (int i = 0; i < cashboxes.size(); i++) {
                    if (check(cashboxes.get(i))) {
                        synchronized (cashboxes.get(i)) {
                        cashboxes.get(i).setFree(false);
                            System.out.println("касса номер " + cashboxes.get(i).getNumber() + " занята покупателем " + Thread.currentThread().getName());
                            System.out.println("покупатель " + Thread.currentThread().getName() + " купил " + Customers.valueOf(Thread.currentThread().getName()).getProduct() +
                                    " в кассе " + cashboxes.get(i).getNumber());
                            System.out.println("касса номер " + cashboxes.get(i).getNumber() + " свободна");
                        cashboxes.get(i).setFree(true);
                        return;
                    }
                }
            }
        }
    }


    public static boolean check(Cashbox cashbox){
        if (cashbox.isFree()){
            return true;
        }
        else return false;
    }

}


