/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author ABDOU
 */
public abstract class BaseModel implements MachineLearningModel {

    protected String name;
    int version;
    String description;
    String device;

    public BaseModel(String device) {
        this.device = device;
    }

  
    
     public  abstract void displayDetails();
}
