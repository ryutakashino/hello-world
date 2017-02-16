import java.io.*;
import java.util.Scanner;

class Story {

    static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void hpgacha(int i) {
        System.out.println("そしてここでステータスを決めます。");
        scan.nextLine();
        System.out.println("あなたのHPをランダムで決定します。");
        scan.nextLine();
        System.out.println("はい。あなたのHPは" + i + "です。");
        if (i < 90) {
            System.out.println("低い！ どんまい");
        } else if (90 <= i && i < 100) {
            System.out.println("まあまあかな");
        } else if (100 <= i && i < 120){
            System.out.println("安定してるでしょう");
        } else {
            System.out.println("高い！ 幸先いいぞ！");
        }
        scan.nextLine();
    }

    static void cave(Buki weapon , Hero hero) {
        scan.nextLine();
        int r = (int)(Math.random() * 6) + 1;
        for (int i = 0; i < r; i++) {
            System.out.println("～進む～");
            scan.nextLine();

            //Encountering rare ozisans
            int s = (int)(Math.random() * 10);
            if (s == 2) {
                System.out.println("とてつもなく恐ろしい気配がする……");
                System.out.println("ここにとどまりますか？\t0:とどまる 0以外:速攻立ち去る");
                String choice = null;
                    try{
                        choice = br.readLine();
                    }catch(IOException e){
                        System.out.println(e);
                    }
            if (choice.equals("0")) {
                    Man huwa2ozisan = new Huwa2Ozisan();
                    //VS HuwaHuwaOzisan
                    Huwa2Ozisan.battle(huwa2ozisan , weapon , hero);
                } else {
                    continue;
                }
            }

            //Encounting Matibouke
            if (s == 3) {
                System.out.println("なんかマネキンがいる……");
                System.out.println("ここにとどまりますか？\t0:とどまる 0以外:速攻立ち去る");
                String choice = null;
                    try{
                        choice = br.readLine();
                    }catch(IOException e){
                        System.out.println(e);
                    }
            if (choice.equals("0")) {
                    Man matibouke = new Matibouke();
                    //VS Matibouke
                    Man.battle(matibouke , weapon , hero);
                } else {
                    continue;
                }
            }


        //Encounting Rapper
            if (s == 4) {
                System.out.println("体中の細胞が韻を踏みたいと叫んでいる");
                System.out.println("ここにとどまりますか？\t0:とどまる 0以外:速攻立ち去る");
                String choice = null;
                    try {
                        choice = br.readLine();
                    } catch(IOException e){
                        System.out.println(e);
                    }
            if (choice.equals("0")) {
                    Man rapper = new Rapper();
                    //VS Rapper
                    Man.battle(rapper, weapon, hero);
                } else {
                    continue;
                }
            }

            //Encountering Gunman
            if (s == 5) {
                System.out.println("遠くから馬の足音が聞こえる……");
                System.out.println("ここにとどまりますか？\t0:とどまる 0以外:速攻立ち去る");
                String choice = null;
                    try{
                        choice = br.readLine();
                    }catch(IOException e){
                        System.out.println(e);
                    }
            if (choice.equals("0")) {
                    Man outlaw = new Outlaw();
                    //VS gunman
                    Outlaw.battle(outlaw , weapon , hero);
                } else {
                    continue;
                }
            }
            
            //Encountering MegamiOzisan
            if(s == 6){
                System.out.println("恐ろしい矛盾のオーラを感じる...");
                System.out.println("ここにとどまりますか？\t0:とどまる 0以外:速攻立ち去る");
                String choice = null;
                    try{
                        choice = br.readLine();
                    }catch(IOException e){
                        System.out.println(e);
                    }
            if (choice.equals("0")) {
                    Man megamiozisan = new MegamiOzisan();
                    //VS MegamiOzisan
                    Man.battle(megamiozisan , weapon , hero);
                } else {
                    continue;
                }
            }
        }
    }
}
