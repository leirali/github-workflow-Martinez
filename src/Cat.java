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

//extend Utils (superclass)
public class Cat extends Utils {

    public Cat (String type, String colour, double cost) {
        this.setType("Cheshire Cat");
        this.setColour(colour);
        this.setCost(cost);
    }

    public void Kitty() {
        System.out.println("meow~");
    }

}
