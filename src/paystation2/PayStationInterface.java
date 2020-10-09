/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paystation2;

/**
 *
 * @author billemerson
 */
public interface PayStationInterface {

    void addPayment(int coinValue);

    String getDisplay();
    
}
