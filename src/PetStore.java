/**
 * Created by Lia Muriel Martinez on 1/18/2017.
 *
 * Add to the provided project a simple pet store.
 * Limit what the store sells to just pets.
 * Each pet type should be its own class as well as the actual pet store.
 * The pet store should have methods of selling and buying pets.
 * There should also be a way to see what pets are available for purchase, so some sort of simple inventory should be kept.
 * You should make at least three different animals types.
 * You MUST have at least one superclass.
 * Main.java should be the entry point and should print out the initial contents of the pet store.
 * Also include a printout of your methods in action, such as buying a cat and showing the inventory with the new cat quantity.
 * Feel free to make the program interactive with a user, but there are no extra points for this.
 * There are, HOWEVER, extra points for working jUnit tests that exercise your methods in the pet store.
 */

//import arraylist
import java.util.ArrayList;

public class PetStore {

    //buy and sell methods
    //must be able to see what pets are available for purchase (inventory)

    //make inventory private and into an arraylist

    private ArrayList InventoryList;

    //initializing inventory arraylist in petstore
    public PetStore() {

        InventoryList = new ArrayList();
    }

    //inventory
    //has to say amount of animals left in the store
    public String getInventory() {
        String string = "Inventory" + "\n"
                + "Pets available: " + InventoryList.size()
                + "\n" + "Animal List: ";
        System.out.println(string);
//        for (PetStore p: InventoryList ) {
//
//        }
        //return string
        return string;
    }

    //buying method
    //like add method, adding in the inventory
    public void Buy(String type, String colour, double cost) {
        if(type.equals("Boston Terrier")) {
            InventoryList.add(new Dog(type, colour, cost));
        } else if(type.equals("Cheshire Cat")) {
            InventoryList.add(new Cat(type, colour, cost));
        } else if(type.equals("Dove")) {
            InventoryList.add(new Bird(type, colour, cost));
        }
    }

    //selling method
    public void Sell(String type) {
        for (int i = 0; i > InventoryList.size(); i++){
            if (InventoryList.get(i) == type){
                InventoryList.set(i, null);
            }
        }
    }

}
