import java.util.Scanner;

public class Matibouke extends Man {
    int counter = 5;

    Scanner scan = new Scanner(System.in);
    Matibouke(){
	this.hp = 50;
	this.name = "マチボーケ";

	System.out.println(this.name + "が現れた！！");
    }

    @Override
    public void talk(Hero hero) {
    	System.out.println(this.name + "「あなたはいしかわさん？」");
        scan.nextLine();
    	System.out.println(hero.name + "「ち、違いますよ...」");
	    scan.nextLine();
        System.out.println(this.name + "「違うの...？」");
	    scan.nextLine();
        System.out.println(this.name + "「...」");
        scan.nextLine();
        System.out.println(this.name + "「...」");
        scan.nextLine();
        System.out.println(this.name + "「...」");
        scan.nextLine();
        System.out.println(this.name + "「...勘違いだったの!?恥ずかしい!」");
        scan.nextLine();
        System.out.println("次の瞬間、" + hero.name + "は内臓を全てえぐり出されてしまった!!");
        scan.nextLine();
        System.out.println("説明しよう!　マチボーケは大切な人(いしかわさん)をずっと待っているぞ!");
        scan.nextLine();
        System.out.println("ときどき、似ている別人に付いていくことがあるが、勘違いだとわかった途端、内臓をすべてえぐり出してしまうぞ!");
        hero.hp -= 200;
        scan.nextLine();
    }

    @Override
    public void run(Hero hero) {
        System.out.println(hero.name + "は逃げ出した!");
        scan.nextLine();
        System.out.println(this.name + "「いしかわさん...」");
        System.out.println(this.name + "はどこまでも追いかけてくる!!");
        scan.nextLine();
        System.out.println("っていうか人違いしてない!?");
        scan.nextLine();
    }

    public void attack(Hero hero){
        System.out.println(this.name + "はただつっ立っているぞ!");
        counter--;
        if(counter == 1) {
            System.out.println("そろそろ嫌な予感がする...");
            scan.nextLine();
        }
        if(counter == 0) {
            System.out.println("次の瞬間、" + hero.name + "は内臓を全てえぐり出されてしまった!!");
            scan.nextLine();
            System.out.println("説明しよう!　マチボーケは大切な人(いしかわさん)をずっと待っているぞ!");
            scan.nextLine();
            System.out.println("ときどき、似ている別人についていくことがあるが、勘違いだとわかった途端、内臓をすべてえぐり出してしまうぞ!");
            hero.hp -= 200;
            scan.nextLine();
        }
    }
}