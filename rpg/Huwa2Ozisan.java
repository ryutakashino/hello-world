import java.io.*;
import java.util.Scanner;

public class Huwa2Ozisan extends Man{
    static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Huwa2Ozisan(){
        this.hp = 40;
        this.name = "ふわふわおじさん";
        System.out.println(this.name+"が現れた！！");
    }

    static void win (String s){
        System.out.println("ふわふわおじさん「無理〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜」");
        System.out.println("ふわふわおじさんは逃げ出した");
        scan.nextLine();
        System.out.println("まあ・・・ええか");
        scan.nextLine();
    }
    public void talk(Hero h){
        System.out.println(this.name + "「縺ゅ＞縺・∴縺� ・撰ｼ托ｼ抵ｼ�繧ｩ 譁・ｭ怜喧縺代ヱ繧ｿ繝ｼ繝ｳ 讖溯・繝ｻ遐皮ｩｶ ・樞包ｼ搾ｼ・ｿ・｡繹ｱ竭竇｡」");
        scan.nextLine();
        System.out.println("ダメだ、文字コードが合わない!!");
        scan.nextLine();
    }
    public void attack(Hero h){
        int ran = (int)(Math.random() * 2);
        int r = (int)(Math.random() * 17);
        int damage = 0;
        switch(ran){
            case 0:
                System.out.println(this.name+"のふわふわ～～！");
                damage = 5+r-h.df;
                break;
            case 1:
                System.out.println(this.name+"のほあ～～～！");
                damage = 2+r-h.df;
                break;
        }
        if(damage < 0) damage = 1;
        h.hp -= damage;
        System.out.println(h.name+"は"+damage+"ダメージを受けた！");
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
                            h.check(h.hp,h.name);
                            scan.nextLine();
                            break;
                        } else {
                            Huwa2Ozisan.win(m.name);
                            break;
                        }

                    case "1":
                        m.talk(h);
                        break;

                    case "2":
                        m.run(h);
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
