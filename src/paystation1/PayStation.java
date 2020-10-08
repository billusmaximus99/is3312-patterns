/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paystation1;

/**
 *
 * @author be_me
 */
public class PayStation {
    
    private int currentTotal = 0;
    private int timeInMinutes = 0;
    
    public PayStation(){
        this.currentTotal = 0;
    }
    
    public void addPayment(int coinsValue){
        this.currentTotal += coinsValue;
        this.timeInMinutes = this.currentTotal * 2;
        
    }
    
    public String getDisplay() {
        String output = "Current Total is :\t" + this.currentTotal + "\n";
        output +="Current Time is :\t" + this.timeInMinutes+ "\n";
        return output;
        
    }
    
}
