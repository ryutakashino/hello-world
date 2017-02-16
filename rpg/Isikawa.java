import java.util.Scanner;

public class Isikawa extends Man{
    Scanner scan = new Scanner(System.in);
    Isikawa(){
        this.hp = 90;
        this.name = "いしかわさん";
        System.out.println(this.name+"が現れた！！");
    }
    public void attack(Hero h){
        int ran = (int)(Math.random() * 2);
        int r = (int)(Math.random() * 5);
        int damage=0;
        switch(ran){
            case 0:
                System.out.println(this.name+"のラリアット！");
                damage = 29+r-h.df;
                break;
            case 1:
                System.out.println(this.name+"のエルボー！");    
                damage = 24+r-h.df;
                break;
        }
        if(damage < 0) damage = 1;
        h.hp -= damage;
        System.out.println(h.name+"は"+damage+"ダメージを受けた！");
    }
}