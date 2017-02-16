import java.io.*;
import java.util.Scanner;

class system {
    static Scanner scan = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    static void Ending(Hero h) {

        System.out.println("クリア！！");
        System.out.println("宝箱だ！");
        System.out.println("いしかわさんの所得が詰まっている！ やったぜ。\n");
        System.out.println("しかし、" + h.name + "は一瞥のあと、踵を返した。");
        System.out.println("ほしかったものは、こんなものではない。");
        System.out.println("もっと、なにか…………なにか、素晴らしいものだったはずだ。");
        System.out.println("答えを探す" + h.name + "は、次なる闘争へと旅立った。");
        System.out.println("いつの日か、安息の日が訪れることを願いながら……");
        System.out.println("\n");
        System.out.println("～To be continued～");

    }

    static void YouDied() {
        System.out.println("＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿");
        System.out.println("");
        System.out.println("■■   ■■    ■■■   ■■■   ■■     ■■■  ■   ■■■ ■■■ ■■  ■■■  ■  ");
        System.out.println(" ■        ■   ■   ■    ■       ■    ■   ■   ■   ■   ■    ■ ");
        System.out.println("  ■      ■     ■  ■    ■       ■     ■  ■   ■       ■     ■");
        System.out.println("  ■ ■    ■     ■  ■    ■       ■     ■  ■   ■ ■     ■     ■");
        System.out.println("   ■     ■     ■  ■    ■       ■     ■  ■   ■■■     ■     ■");
        System.out.println("   ■     ■     ■  ■    ■       ■     ■  ■   ■       ■     ■");
        System.out.println("   ■      ■   ■   ■■  ■■       ■    ■   ■   ■       ■    ■ ");
        System.out.println("  ■■■      ■■■     ■■■■       ■■■ ■■   ■■■  ■■ ■■  ■■■ ■■  ");
        System.out.println("＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿ ");
        System.out.println("        However, the Nexus traps you. ");
        System.out.println("        You stay in the world as Soul.forever ");
    }
}
