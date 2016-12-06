/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etssi;

import java.io.IOException;

/**
 *
 * @author jehan
 */
public class ETSSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Dataset test = new Dataset("data/nb_voyageur_ligne_E.csv");
        System.out.print(test.getData_array());
        // TODO code application logic here
    }
    
}
