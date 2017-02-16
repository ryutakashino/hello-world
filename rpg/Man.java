import java.io.*;
import java.util.Scanner;

public abstract class Man {
    static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int hp;
    String name;

    public abstract void attack(Hero h);

    static void win(String s) {
        System.out.println(s+"を倒した！！");
        scan.nextLine();
    }

    static void eat(String s, Hero h) {
        System.out.println(s + "の肉を喰らった！");
        int r = (int)(Math.random() * 5) + 19;
        h.hp += r;
        System.out.println(h.name + "は" + r + "回復した！！");
        scan.nextLine();
    }


    static void battle(Man m, Buki w, Hero h) {
        try{
            while (m.hp > 0) {
                System.out.println("どうする？");
                System.out.println("0:攻撃　1:説得　2:逃げる");
                System.out.println("(半角で数字を入力)");
                String line2 = br.readLine();

                switch (line2) {
                    case "0":
                        w.attack(m);
                        scan.nextLine();
                        if (m.hp > 0) {
                            m.attack(h);
                            Hero.check(h.hp,h.name);
                            scan.nextLine();
                            break;
                        } else {
                            Man.win(m.name);
                            break;
                        }

                    case "1":
                        m.talk(h);
                        Hero.check(h.hp,h.name);
                        break;

                    case "2":
                        m.run(h);
                        break;

                    case "debug":
                        System.out.println("HP: " + h.hp);
                        System.out.println("DF: " + h.df);
                        break;

                    default:
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void talk(Hero h) {
        System.out.println(h.name + "「" + this.name + "～～～～～～～～～～～～～～～～～」");
        scan.nextLine();
        System.out.println(this.name + "「は？」");
        scan.nextLine();
        System.out.println("聞く耳を持たないようだ！");
        scan.nextLine();
    }

    public void run(Hero h) {
        System.out.println(h.name + "は逃げ出した！");
        scan.nextLine();
        System.out.println("が、" + this.name + "がどこまでも追いかけてくる！");
        System.out.println("逃げられない！！");
        scan.nextLine();
    }
}
