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
    private int generateRoll1 = ThreadLocalRandom.current().nextInt(1,6);
    private int generateRoll2 = ThreadLocalRandom.current().nextInt(1,6);
    private int generateRoll3 = ThreadLocalRandom.current().nextInt(1,6);

    /**
    * Returns value of centerPot
    * @return
    */
    public int getCenterPot() {
        return centerPot;
    }

    /**
    * Sets new value of centerPot
    * @param
    */
    public void setCenterPot(int centerPot) {
        this.centerPot = centerPot;
    }

    /**
    * Returns value of playerList
    * @return
    */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /**
    * Sets new value of playerList
    * @param
    */
    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    /**
    * Returns value of result
    * @return
    */
    public String getResult() {
        return result;
    }

    /**
    * Sets new value of result
    * @param
    */
    public void setResult(String result) {
        this.result = result;
    }

    /**
    * Returns value of generateRoll1
    * @return
    */
    public int getGenerateRoll1() {
        return generateRoll1;
    }

    /**
    * Sets new value of generateRoll1
    * @param
    */
    public void setGenerateRoll1(int generateRoll1) {
        this.generateRoll1 = generateRoll1;
    }

    /**
    * Returns value of generateRoll2
    * @return
    */
    public int getGenerateRoll2() {
        return generateRoll2;
    }

    /**
    * Sets new value of generateRoll2
    * @param
    */
    public void setGenerateRoll2(int generateRoll2) {
        this.generateRoll2 = generateRoll2;
    }

    /**
    * Returns value of generateRoll3
    * @return
    */
    public int getGenerateRoll3() {
        return generateRoll3;
    }

    /**
    * Sets new value of generateRoll3
    * @param
    */
    public void setGenerateRoll3(int generateRoll3) {
        this.generateRoll3 = generateRoll3;
    }

    /**
     *  Constructor for the DiceEngine object
     */
    public DiceEngine() {
        playerList = new ArrayList<Player>();
        centerPot = 0;
    }

    public void createPlayers(int playerCount) {
        int i = 0;
        for (i <= playerCount) {
            Player newPlayer = new Player();
            newPlayer.setPlayerNumber = i;
            playerList.add(newPlayer);
            i++;
        }
    }

    public void rollDice(Player activePlayer) {

        if (generateRoll1 == 5 && generateRoll2 == 5 && generateRoll3 == 5) {
            activePlayer.setOwnedPot(activePlayer.getOwnedPot() + centerPot);
            centerPot = 0;
        }

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
