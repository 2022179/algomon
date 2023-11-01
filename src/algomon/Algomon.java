/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algomon;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
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
        // TODO code application logic here

    private final String name;
    private final ElementType element;
    private final int health;
    private final int attack;
    private final int defense;
    private final int speed;
    private final ArrayList<Object> abilities;
    public Algomon(String name, ElementType element)
    {
this.name = name;
this.element = element;
this.health = new Random().nextInt(51) + 50;

this.attack = new Random().nextInt(21) + 10;
this.defense = new Random().nextInt(16) + 5;
this.speed = new Random().nextInt(10) + 1;
this.abilities = new ArrayList<>();
}
    
    public void addAbility(Ability ability) {
abilities.add(ability);
}

public void activateAbility(int index, Algomon target) {
if (index &gt;= 0 &amp;&amp; index &lt; abilities.size()) {
abilities.get(index).activate(this, target);
}
}

}
}