/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author ABDOU
 */
public class NeuralNetwork extends BaseModel {
    int[] layers ;
    String  activationFunction; 

    public NeuralNetwork(String device, int[] layers, String activationFunction ) {
        super(device);
        this.layers = layers;
        this.activationFunction = activationFunction;
    }

 
    @Override
    public void displayDetails() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double predict(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
