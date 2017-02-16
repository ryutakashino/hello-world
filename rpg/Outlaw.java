import java.io.*;
import java.util.Scanner;

public class Outlaw extends Man{
    static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    Outlaw(){
        this.hp = 10;
        this.name = "さすらいのガンマン";
        System.out.println(this.name+"が現れた！！");
    }

    public void attack(Hero h){

    }
    
    static void battle(Man m, Buki w, Hero h) {
        try{
            System.out.println(m.name + "「早撃ち勝負といこう」");
            scan.nextLine();
            System.out.println("Shoot!の合図が出たらできるだけ早くEnterを押せ");
            scan.nextLine();
            System.out.println("Ready...?");
            scan.nextLine();
            System.out.println("");
            
            int random = (int)(Math.random() * 10000) + 1000;
            Thread.sleep(random);
            
            long start = System.currentTimeMillis();
            System.out.println("shoot!");
            scan.nextLine();
            long end = System.currentTimeMillis();
            System.out.println("Bang!");
            for(int i = 0;i < 5;i++){
                Thread.sleep(500);
                System.out.println(".");
            }

            if(end - start > 500){
                System.out.println(m.name + "「Rest in peace...」");
                h.hp = 0;
            }else{
                System.out.println(m.name + "「いいセンスだ…」");
                Man.win(m.name);
            }

            Hero.check(h.hp,h.name);
        }catch(InterruptedException e){
        }
    }
}
