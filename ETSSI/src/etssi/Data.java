/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etssi;

import java.io.File;


/**
 *
 * @author jehan
 */
public class Data {
    private String nom_gare;
    private Integer code_gare;
    private String type_jour;
    private Integer tranche_horaire; 
    private Integer montant; 
   
    /**
       * Constructor
    */
    public Data(String nom_gare,Integer code_gare,String type_jour,Integer tranche_horaire,Integer montant) {
        setNom_gare(nom_gare);
        setCode_gare(code_gare);
        setType_jour(type_jour);
        setTranche_horaire(tranche_horaire);
        setMontant(montant);
    }
    /**
     * @return the nom_gare
     */
    public String getNom_gare() {
        return nom_gare;
    }

    /**
     * @param nom_gare the nom_gare to set
     */
    public void setNom_gare(String nom_gare) {
        this.nom_gare = nom_gare;
    }

    /**
     * @return the code_gare
     */
    public Integer getCode_gare() {
        return code_gare;
    }

    /**
     * @param code_gare the code_gare to set
     */
    public void setCode_gare(Integer code_gare) {
        this.code_gare = code_gare;
    }

    /**
     * @return the type_jour
     */
    public String getType_jour() {
        return type_jour;
    }

    /**
     * @param type_jour the type_jour to set
     */
    public void setType_jour(String type_jour) {
        this.type_jour = type_jour;
    }

    /**
     * @return the tranche_horaire
     */
    public Integer getTranche_horaire() {
        return tranche_horaire;
    }

    /**
     * @param tranche_horaire the tranche_horaire to set
     */
    public void setTranche_horaire(Integer tranche_horaire) {
        this.tranche_horaire = tranche_horaire;
    }

    /**
     * @return the montant
     */
    public Integer getMontant() {
        return montant;
    }

    /**
     * @param montant the montant to set
     */
    public void setMontant(Integer montant) {
        this.montant = montant;
    }
}
