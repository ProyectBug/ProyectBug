/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprog;
import DataBaseLibrary.Metodos;
/**
 *
 * @author Aaron
 */
public class ProyectoFinalProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bienvenidos obx = new Bienvenidos();
       obx.setVisible(true);
       Metodos lib = new Metodos();
       lib.Conectar("jdbc:mysql://localhost", "zoo", "user=root", "password=Sobrada12345");
        
       
    }
    
}
