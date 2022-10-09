package stu.najah.edu.cap.ass2;

import java.util.ArrayList;

public class Monster extends Entity implements MakeNoise{
    public ArrayList<MonsterFast> getmonstersfast() {

        return monstersfast;
    }
    public ArrayList<MonsterStealth> getmonsterstealth() {
        return monsterstealth;
    }
    private ArrayList<MonsterFast> monstersfast;
    private ArrayList<MonsterStealth> monsterstealth;

    public Monster(){
        monstersfast = new ArrayList<>();
        monsterstealth=new ArrayList<>();
    }
    public void ToString() {
        System.out.println( "Monster{ move: "); move();
        System.out.println("render: ");render();
        System.out.println("noise: ");noise();
        System.out.println("}");
    }
    @Override
    public void move() {
        System.out.println(" monster movement");
    }
    @Override
    public void noise() {
        System.out.println("Monster noise");
    }
    @Override
    public void render() {
        System.out.println("monster render");
    }
}
