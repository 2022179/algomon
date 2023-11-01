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
    private String name;
    private ElementType element;
    private int Health;
    private int attack;
    private int defense;
    private int speed;
    private Arraylist<Ability>abilities; 
    private final int health;
    
    public Algomon(String name, ElemenType element){
    
    this.name=name;
    this.element = element;
    this.health = new Random().nextInt(51)+50;
    this.attack = new Random().nextInt(21)+10;
    this.speed = new Random().nextInt(10)+1;
    this.abilities= new ArryList<>();
    
    }
     public void addAbility(Ability ability){
     
     abilities.add(ability);
     }
    public void activateAbility(int index, Algomon target){
    
    if(index >= 0 && index <ability.size()){
    abilities.get(index).activate(this,target);
    
    }
    
    }
}
