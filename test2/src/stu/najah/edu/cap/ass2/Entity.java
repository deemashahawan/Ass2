package stu.najah.edu.cap.ass2;

import java.util.ArrayList;
import java.util.List;

public class Entity implements MakeRender,MakeMove {

     public void move() {
         System.out.println("Entity movement ");
     }


     public void render() {
         System.out.println("Entity render");
     }


    public void ToString() {
        System.out.println( "Entity{ move: "); move();
        System.out.println("render: ");render();
        System.out.println("}");
    }
}
