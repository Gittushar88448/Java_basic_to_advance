
//Simulate a dice roll using Math.random() and display the outcome (1 to 6).
public class DiceRolling {

    int dice(){
        return (int) Math.ceil( Math.random() * 6 );
    }

    public static void main(String[] args) {

        DiceRolling diceR = new DiceRolling();

        for (int i = 0; i < 6; i++) {

        System.out.println(diceR.dice());

        }
    }

}
