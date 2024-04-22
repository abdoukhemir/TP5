/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

/**
 *
 * @author ABDOU
 */
import java.io.*;

public class FileManager {

   public void readFile(String filePath) throws FileNotFoundException {
        File file = new  File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        }
   }
}