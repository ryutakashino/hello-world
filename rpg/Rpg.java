import java.io.*;
import java.util.Scanner;

public class Rpg {
    public static void main (String[] args) {

    //Opening
        System.out.println("こんにちは。\nこれは洞窟の奥にあるお宝をさがすRPG(？)です。");
        System.out.println("とりあえず、あなたの名前を教えてください。");

    //Hero's birthday
        Hero h = new Hero();

    //Weapon Gacha
        System.out.println("ここで冒険するには武器が欠かせないので武器ガチャを引きましょう");
        Buki wp = null;
        wp = Bukigacha.bukigacha(h,wp);
        wp.description(h);
        int i = h.hp;
        Story.hpgacha(i);

    //display hero's status
        System.out.println("では早速洞窟を探検していきましょう。");
        Story.cave(wp, h);
        Man isikawa = new Isikawa();

    //ISHIKAWA
        Isikawa.battle(isikawa, wp, h);
        Man.eat(isikawa.name, h);
        System.out.println("お宝はもう少しだ！ しかし危険な予感がする");
        Story.cave(wp, h);
        Man isikawani = new Isikawani();

    //BOSS
        Isikawani.battle(isikawani, wp, h);

    //Ending
        system.Ending(h);

    }
}
