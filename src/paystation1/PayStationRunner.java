/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paystation1;

import java.util.Scanner;

/**
 *
 * @author be_me
 */
public class PayStationRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting Up!");
        PayStation pStat = new PayStation();
        boolean keepProcessing = true;
        
        while (keepProcessing==true){
            System.out.println(pStat.getDisplay());
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Coin or 0 to Finish");
            int i = sc.nextInt();
            if (i==0){
                keepProcessing=false;
                continue;
            }
            pStat.addPayment(i);
            System.out.println(pStat.getDisplay());
            
            
        }
        
        
    }
    
}
