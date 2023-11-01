/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomon;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class AlgomonTeam {

    private static AlgomonTeam[] values() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Player player1 = new Player("Player 1");
    Player player2 = new Player("Player 2");

        // Create Algomon for Player 1
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            AlgomonTeam algomonType = AlgomonTeam.values()[rand.nextInt(AlgomonTeam.values().length)];
            String algomonName = algomonType + " Algomon";
            int health = rand.nextInt(51) + 50;
            int attack = rand.nextInt(21) + 10;
            int defense = rand.nextInt(16) + 5;
            int speed = rand.nextInt(10) + 1;
            Algomon algomon = new Algomon(algomonName, algomonTeam, health, attack, defense, speed);
            player1.addAlgomonToTeam(algomon);
        }

        // Create Algomon for Player 2
        for (int i = 0; i < 4; i++){
            AlgomonTeam algomonType = AlgomonTeam.values()[rand.nextInt(AlgomonTeam.values().length)];
            String algomonName = algomonType + " Algomon";
            int health = rand.nextInt(51) + 50;
            int attack = rand.nextInt(21) + 10;
            int defense = rand.nextInt(16) + 5;
            int speed = rand.nextInt(10) + 1;
            
}
        
}