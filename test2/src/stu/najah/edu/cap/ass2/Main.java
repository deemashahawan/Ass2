package stu.najah.edu.cap.ass2;

public class Main {
    public static void main(String[] args) {
        Monster e1=new Monster();
       e1.move();
       e1.render();
       e1.noise();
       MonsterFast e2=new MonsterFast();
        e2.move();
        e2.render();
        e2.noise();
        MonsterStealth e3=new MonsterStealth();
        e3.move();
        e3.render();
        e3.noise();

        Player p=new Player();
        p.move();
        p.render();
    }
}
