package stu.najah.edu.cap.ass2;

public class Monster extends Entity implements MakeNoise{

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
