/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paystation2;

import paystation2.*;

/**
 *
 * @author be_me
 */
public class PayStation implements PayStationInterface {
    
    private int currentTotal = 0;
    private int timeInMinutes = 0;
    
    public PayStation(){
        this.currentTotal = 0;
    }
    
    @Override
    public void addPayment(int coinValue){
        this.currentTotal += coinValue;
        this.timeInMinutes = getTimeFromValue(this.currentTotal);
        
    }
    
    @Override
    public String getDisplay() {
        String output = "Current Total is :\t" + this.currentTotal + "\n";
        output +="Current Time is :\t" + this.timeInMinutes+ "\n";
        return output;
        
    }
    
    int getTimeFromValue(int timeInMinutes){
        
        int timeBought = 0;
        
        timeBought = timeInMinutes * 2;
        
        return timeBought;
    }
    
}
