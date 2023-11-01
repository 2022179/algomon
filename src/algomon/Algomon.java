/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algomon;

import algomon.enums.AlgomonType;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Lecturer
 * GitHub link:
 * Group Member 1 Name: Primrose
 * Group Member 1 Student Number: 2022179
 * Group Member 2 Name:Caroline Iheanacho
 * Group Member 2 Student Number: 2022503
 */
public class Algomon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
 
    private final String name;
    private final AlgomonType type;
    private int health;
    private final int attack;
    private final int defense;
    private final int speed;

    public Algomon(String name, AlgomonType type, int health, int attack, int defense, int speed) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        
        
         
    List<Ability> abilitiesDefensive = new ArrayList<>();
    List<Ability> abilitiesHealing = new ArrayList<>(); 
    List<Ability> abilitiesOffensive = new ArrayList<>();
   
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
 
}
}
