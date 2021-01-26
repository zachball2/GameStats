/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestats;

/**
 *
 * @author Zachcollins
 */
public class Players {

    private int number;
    private String name;
    private int points;
    private String teamName;
    
    public Players(){
        
    }

    public Players(int i, String n, int p,String t) {//States what my players have
        number = i;
        name = n;
        points = p;
        teamName = t;
    }

    public int getNumber() {
        return number;  //gets the number of the player
    }

    public String toString() {
        return "Number " + number + "  " + name + "  " + points + " points  " + teamName; //each players requirements
    }

    
    public int compareTo(Players other) {   //comparing to other players
        return name.compareTo(other.name);
        /*       if (number < other.number){
            return -1;
        }else if (number > other.number){
            return 1;
        }else{
            return 0;
        }
         */
    }
}