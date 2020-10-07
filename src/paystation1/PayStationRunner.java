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
        System.out.println("Current Value of Pay Station: " + pStat.currentTotal);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Value");
        int i = sc.nextInt();
        System.out.println(i);
    }
    
}
