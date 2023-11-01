/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomon;

/**
 *
 * @author User
 */
public class OffensiveAbility implements abilityType {
    
    
    private String name;
    
    public OffensiveAbility(String name){
        
        this.name = name;
    }
    
    @Override
    
    public void activate(Algomon source, Algomon target){
    
        System.out.println(source +"activates Offensive Ability" + name +on" + target.name);
    
    }
}
