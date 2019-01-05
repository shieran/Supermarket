public enum Customers {

    VICTOR("картошку"),
    KATYA("помидоры"),
    OLGA("морковку"),
    Kirill("молоко"),
    VASYA("хлеб"),
    DASHA("батон"),
    STAS("соль"),
    DIMA("яйца"),
    ARTEM("кофе"),
    OLEG("макароны"),
    IGOR("арбуз"),
    KOLYA("яблоки"),
    VALERA("рыбу"),
    IRINA("тарелки"),
    ULIA("сахар");


    private final String product;

    Customers(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
