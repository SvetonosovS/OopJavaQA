package Lesson1;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
     
        List<HotDrink> newList = new LinkedList<>();

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(newList);

        HotDrink coffee = new HotDrink("Americano", 30.0, 150, 70);
        HotDrink tea = new HotDrink("Black Tea", 35.0, 500, 85);

        newList.add(coffee);
        newList.add(tea);

        System.out.println(machine.getProduct("Americano", 150, 70));
        System.out.println(machine.getProduct("Black Tea", 500, 85));
    }
}
    
