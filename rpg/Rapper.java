import java.util.Scanner;

public class Rapper extends Man {
    Scanner scan = new Scanner(System.in);
    Rapper(){
        this.hp = 50;
        this.name = "ラッパー";
        System.out.println(this.name + "が現れた！！");
    }

    @Override
    public void talk(Hero h) {
        System.out.println(this.name + "「Yo、Yo、俺は世田谷生まれヒップホップ育ち、悪そうなやつは大体友達、そうだと思う、そうであってくれ……」");
        scan.nextLine();
        System.out.println("Yo……");
        scan.nextLine();
    }
    public void attack(Hero h){
        int ran = (int)(Math.random() * 4);
        int r = (int)(Math.random() * 17);
        int damage = 0;
        switch(ran){
            case 0:
                System.out.println(this.name + "の圧倒的Dis！\n");
                System.out.println(this.name + "「お前のライムに魂はなく、すべてがフェイク、いうまでもなく、まがいもの、よわいもの、お前のみゴミの中のゴミ！！！１１１１１１１１」\n");
                System.out.println(h.name + "は、Disを返せなかった……");
                System.out.println("ラッパーとして最高の無礼だ……\n");

                damage = 10+r-h.df;
                break;

            default:
                System.out.println(this.name + "のDis！");
                System.out.println(this.name + "「Hey, Yo! (任意のDis)」");
                damage = 2+r-h.df;
                break;
        }
        if(damage < 0) damage = 1;
        h.hp -= damage;
        System.out.println(h.name + "は" + damage + "ダメージを受けた！");
    }
}
