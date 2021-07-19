package karling.nicolas.RollDiceAPI.Databases;

import karling.nicolas.RollDiceAPI.Model.Dice;

import java.util.ArrayList;
import java.util.List;

public class FakeDiceDatabase {
    public List<Dice> diceNumber = new ArrayList<Dice>();

    public FakeDiceDatabase(){
        diceNumber.add(new Dice(1));
        diceNumber.add(new Dice(2));
        diceNumber.add(new Dice(3));
        diceNumber.add(new Dice(4));
        diceNumber.add(new Dice(5));
        diceNumber.add(new Dice(6));
        diceNumber.add(new Dice(7));
        diceNumber.add(new Dice(8));
        diceNumber.add(new Dice(9));
        diceNumber.add(new Dice(10));
        diceNumber.add(new Dice(11));
        diceNumber.add(new Dice(12));
        diceNumber.add(new Dice(13));
        diceNumber.add(new Dice(14));
        diceNumber.add(new Dice(15));
        diceNumber.add(new Dice(16));
        diceNumber.add(new Dice(17));
        diceNumber.add(new Dice(18));
        diceNumber.add(new Dice(19));
        diceNumber.add(new Dice(20));
    }
}
