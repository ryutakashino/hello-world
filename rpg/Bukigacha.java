import java.util.Scanner;

class Bukigacha{

static Buki bukigacha(Hero h, Buki w){
    Scanner scan = new Scanner(System.in);

        Buki weapons[] =
        {
            new Takeyari(),
            new Shield(h),
            new Halberd(),
            new KaenBin(),
            new DekkiBurashi(),
            new TuyoiKimochi(h),
            new Kobushi(),
            new GatlingGun()
        };

        //Please add weapons!!!!!!!!!!!!!!
        int r = (int)(Math.random() * weapons.length);
        scan.nextLine();
        System.out.println("『武器ガチャを回す』　Enter!!（初回無料！）");
        scan.nextLine();
        System.out.println("ダララララララララララララララララララ");
        scan.nextLine();
        return weapons[r];
    }
}
