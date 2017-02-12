/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancehomework1;

/**
 *
 * @author Sanuth
 */
public class FictionalCharacter {
    double price;
    String name;
    boolean costume;
    String type;

    public boolean isCostume() {
        return costume;
    }

    public void setCostume(boolean costume) {
        this.costume = costume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
