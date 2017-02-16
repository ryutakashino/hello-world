import java.util.Scanner;

public class Kobushi extends Buki{
    static Scanner scan = new Scanner(System.in);
    static String heroname = "";
    Kobushi(Hero h){
        heroname = h.name;
        this.name = "こぶし";
    }

    Kobushi(){
        this.name = "こぶし";
    }
    
    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage=10+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        }else {
            damage = 12+randam;
            System.out.println(heroname + "「ああああああああああああああああ！！！！！！！」（腹パン）");
            System.out.println(damage+"のダメージ！！");
        }
        m.hp -= damage;
    }

    public void description(Hero h) {
        
        System.out.println("かわいいクマのぬいぐるみだ！！！");
        scan.nextLine();
        System.out.println("かわいい");
        scan.nextLine();
        System.out.println("くまのぬいぐるみかわいい");
        scan.nextLine();
        System.out.println("しかし体は闘争を求める");
        scan.nextLine();
        System.out.println("己の拳で戦うことにした！");
    }
}