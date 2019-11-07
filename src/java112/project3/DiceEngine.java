package java112.project3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *  Represents dice rolls and gameplay.
 *
 *@author    mHall
 */
public class DiceEngine extends Object {

    private int centerPot;
    private ArrayList<Player> playerList;
    private String result;

    /**
     *  Constructor for the DiceEngine object
     */
    public DiceEngine() {
        playerList = new ArrayList<Player>();
        centerPot = 0;
    }

    public void createPlayers(int playerCount) {
        int i = 0; // int i will be initialized to 0 each time we call this function; is that OK, or should I edit this?
        for (i <= playerCount) {
            Player newPlayer = new Player();
            newPlayer.setPlayerNumber = i;
            playerList.add(newPlayer); // I am adding the new player to the playerList array
            i++; // I incremented the player number so that not all players will be named "0"
        }
    }

    public void rollDice(Player activePlayer) { // how do we know who the active player is
        int generateRoll = ThreadLocalRandom.current().nextInt(1,6);

        // I got this information from dicegamedepot.com/lcr-dice-game-rules/
        if (generateRoll == 1 || generateRoll == 2 || generateRoll == 3) {
            result = "Dot";
        } else if (generateRoll == 4) {
            result = "Left";
            left(activePlayer);
        } else if (generateRoll == 5) {
            result = "Center";
            center(activePlayer);
        } else if (generateRoll == 6) {
            result = "Right";
            right(activePlayer);
        }
    }

    public void left(Player activePlayer) {
        // local variables
        Player leftPlayer;

        activePlayer.setOwnedPot = ownedPot - 1;
        if (activePlayer.getPlayerNumber() != (playerList.length() - 1)) {
            leftPlayer = playerList.get(activePlayer.getPlayerNumber() + 1);
            leftPlayer.setOwnedPot(ownedPot++);
        } else {
            leftPlayer = playerList.get(0);
            leftPlayer.setOwnedPot(ownedPot++);
        }
    }

    public void center() {
        activePlayer.setOwnedPot = ownedPot - 1;
        centerPot++;

    }

    public void right() {
        // local variables
        Player rightPlayer;

        activePlayer.setOwnedPot = ownedPot - 1;
        if (activePlayer.getPlayerNumber != 0) {
            rightPlayer = playerList.get(activePlayer.getPlayerNumber() - 1);
            rightPlayer.setOwnedPot(ownedPot++);
        } else {
            rightPlayer = playerList.get(playerList.length() - 1);
            rightPlayer.setOwnedPot(ownedPot++);
        }


    }
}
