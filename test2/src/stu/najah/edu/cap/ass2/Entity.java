package stu.najah.edu.cap.ass2;

import java.util.ArrayList;
import java.util.List;

public class Entity {

      public ArrayList<Monster> getmonsters() {
          return monsters;
      }
    public ArrayList<Player> getplayers() {
        return players;
    }
      private ArrayList<Monster> monsters;
    private ArrayList<Player> players;

      public Entity(){
          monsters = new ArrayList<>();
          players=new ArrayList<>();
      }

     public void move() {
         System.out.println("Entity movement ");
     }


     public void render() {
         System.out.println("Entity render");
     }
 }
