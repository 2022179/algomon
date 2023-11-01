/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomon;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Player {
    //name made private 
    private final String name;
    
private ArrayList<Algomon>algomonTeam;
           
            public Player(String name){
            this.name = name;
            this.algomonTeam =  new ArrayList<>();
            
            }
            
     public void addAlgomon(Algomon algomon){
     
     if(algomonTeam.size()<4){
     
     algomonTeam.add(algomon);
     }else{
     // output
         System.out.println(name +"cannot have more tha 4 Algomon!");
     }
     
     }

    void addAlgomonToTeam(Algomon algomon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
