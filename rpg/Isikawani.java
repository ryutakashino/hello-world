import java.io.*;
import java.util.Scanner;

public class Isikawani extends Man {
    static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    Isikawani() {
        this.hp = 90;
        this.name = "兄";
        System.out.println(this.name + "が現れた！！");
        scan.nextLine();
        System.out.println("兄「翔大……」\n");
        scan.nextLine();
    }

    public void attack(Hero h) {

        int ran = (int)(Math.random() * 3);
        int r = (int)(Math.random() * 5);
        int damage = 0;

        switch(ran){
            case 0:
                System.out.println(this.name + "のラリアット！");
                damage = 35+r-h.df;
                break;

            case 1:
                System.out.println(this.name + "のエルボー！");
                damage = 30+r-h.df;
                break;

            case 2:
                System.out.println(this.name + "のタックル！");
                damage = 40+r-h.df;
                break;
        }

        if(damage < 0) damage = 1;
        h.hp -= damage;

        System.out.println(h.name + "は" + damage + "ダメージを受けた！");
    }

    static void win (String s){
        System.out.println("いしかわ兄の霊圧が消えた・・・");
        scan.nextLine();
        System.out.println("兄を倒した！！！！！");
        scan.nextLine();
    }

    static void anitalk(Man m, Buki w, Hero h) {
        System.out.println(h.name + "「許してください！なんでもしますから！！」");
        scan.nextLine();
        System.out.println(m.name + "「は？」");
        scan.nextLine();
        m.attack(h);
        Hero.check(h.hp,h.name);
        scan.nextLine();
    }

    static void anirun(Man m, Buki w, Hero h) {
        System.out.println(h.name + "は逃げ出した！");
        scan.nextLine();
        System.out.println("が、" + m.name + "がどこまでも追いかけてくる！");
        System.out.println("逃げられない！！");
        scan.nextLine();
        m.attack(h);
        Hero.check(h.hp,h.name);
        scan.nextLine();
    }

    static void battle(Man m, Buki w, Hero h) {
        try{
            while (m.hp > 0) {
                System.out.println("どうする？");
                System.out.println("0:攻撃　1:土下座　2:逃げる");
                System.out.println("(半角で数字を入力)");
                String line2 = br.readLine();
                switch (line2) {
                    case "0":
                        m.attack(h);
                        Hero.check(h.hp,h.name);
                        scan.nextLine();
                        if (m.hp > 0) {
                            w.attack(m);
                            scan.nextLine();
                            break;
                        } else {
                            Isikawani.win(m.name);
                            break;
                        }

                    case "1":
                        Isikawani.anitalk(m,w,h);
                        break;

                    case "2":
                        Isikawani.anirun(m,w,h);
                        break;

                    default:
                        break;
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
