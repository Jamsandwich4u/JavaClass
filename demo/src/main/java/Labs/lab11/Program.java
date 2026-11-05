package Labs.lab11;

import java.util.ArrayDeque;
import java.util.Deque;

public class Program {
    static Deque<ShoppingBasket> baskets = new ArrayDeque<>();
    public static void main(String[] args) {
        buy();
        processBaskets();
        processBaskets();
    }

    static void buy(){
        baskets.add(new ShoppingBasket("Milk", 2, 1.50));
        baskets.add(new ShoppingBasket("Bread", 1, 2.20));
        baskets.add(new ShoppingBasket("Eggs", 12, 3.10));
    }

    static void processBaskets() {
        ShoppingBasket b = baskets.remove();
        b.displayDetails();
    }
}
