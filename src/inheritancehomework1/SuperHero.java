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
public class SuperHero extends ComicCharacter{
    String symbol;
    

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void UsePower(){
        System.out.println("Save people and fight against evil");
    }
}
