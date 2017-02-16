import java.io.*;
import java.util.Scanner;

public class Hero {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Scanner scan = new Scanner(System.in);

    int hp;
    int df;
    String name;

    static String defaultName = "ISHIKAWA";

    Hero() {
        int ran = (int)(Math.random() * 50);
        this.hp = 80+ran;
        this.df = 10;
        this.name = setName();
    }

    static String setName() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        try {
            while (true) {

                System.out.print("\n名前：");
                String name = br.readLine();
                System.out.println("");

                if (name.length() == 0) {
                    name = defaultName;
                    System.out.println("は？\n\n名前を晒したくない場合は、自動的に" + name + "になります。");
                }

                System.out.println("\nあなたの名前は" + name + "でよろしいですか？");

                while (true) {
                    System.out.print("\n「yes」or「no」を入力：");
                    String line = br.readLine();
                    switch (line) {
                        case "yes":
                            System.out.println("\nようこそ" + name + "！");
                            return name;

                        case "no":
                            System.out.println("\n正しい名前を入力してください。");
                            break;

                        default:
                            System.out.println("\nは？");
                            System.out.println("正しく入力しろ(怒)(怒)(怒)\n");
                            break;
                    }
                }
            }

        } catch(IOException e) {
            System.out.println(e);
        }

        return "Please debug!";
    }

    static void check(int t, String s) {

        String yuigon[] =
        {
            "あああああああああ！！！（死）",
            "あっ（死）",
            "はい。（死）",
            "我が生涯に一片の悔い無し！（死）"
        };


        if (t <= 0) {
            int r = (int)(Math.random() * yuigon.length);
            System.out.println(s + "「" + yuigon[r] + "」\n");
            scan.nextLine();
            System.out.println(s + "は死んだ");
            System.out.println("G A M E O V E R");
            system.YouDied();
            System.exit(1);

        } else {
            System.out.println(s + "の現在のHPは" + t + "です。");
        }
    }
}
