/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author ABDOU
 */
public class RegressionDataset extends Dataset {

    int numFeatures ;
    double[] targets ;

    public RegressionDataset(String path, boolean isTrain) {
        super(path, isTrain);
    }

 


    @Override
    public void chargement() {
        System.out.println("charger isTrain path numFeatures targets ");
    }

    @Override
    public void prétraitement() {
        System.out.println(" isTrain : "+isTrain + "pat : " + path +"numFeatures:" + numFeatures +"targets" + targets  );
}}
