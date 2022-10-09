package stu.najah.edu.cap.ass2;

public class Player extends Entity{
    @Override
    public void move() {
        System.out.println("player movement");
    }
    @Override
    public void render() {
        System.out.println("player render");
    }
    public void ToString() {
        System.out.println( "Player{ move: "); move();
        System.out.println("render: ");render();
        System.out.println("}");
    }
}
