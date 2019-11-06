package java112.project3;
import java.util.*;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    mHall
 */
public class Player extends Object {

    private  int  ownedPot;
    private string name;


    /**
     *  Constructor for the BeanOne object
     */
    public Player() {
        ownedPot  = 10;
    }


    /**
     *  Gets the ownedPot attribute of the BeanOne object
     *
     *@return    The mySpecialData value
     */
    public String getOwnedPot() {
        return ownedPot;
    }


    /**
     *  Sets the mySpecialData attribute of the BeanOne object
     *
     *@param  ownedPot  The new mySpecialData value
     */
    public void setOwnedPot(String ownedPot) {
        this.mySpecialData = ownedPot;
    }

}
