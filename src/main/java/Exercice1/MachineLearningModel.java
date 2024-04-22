/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exercice1;

/**
 *
 * @author ABDOU
 */
public interface MachineLearningModel {
    void train(Dataset dataset) ;
    double predict(Dataset dataset); 
}
