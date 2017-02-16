import java.util.Scanner;

public class MegamiOzisan extends Man{
    Scanner scan = new Scanner(System.in);
    MegamiOzisan(){
	this.hp = 60;
	this.name = "女神おじさん";
	System.out.println(this.name + "が現れた！！");
    }

    @Override
    public void talk(Hero h){
	System.out.println(this.name + "「女神おじさんです」");
	scan.nextLine();
	System.out.println("だめだ、性別がわからない！");
	scan.nextLine();
    }

    public void attack(Hero h){
	int times = (int)(Math.random() * 4) + 3; //number of attack times;

	for(int s = 0; s < times; s++){
	    int r = (int)(Math.random() * 6 + 10);
	    int damage = (r - h.df);
	    if(damage < 0) damage = 1;
	    h.hp -= damage;
	    System.out.println(h.name + "は" + damage + "ダメージを受けた！\n");
	    try{
	    Thread.sleep(100); //sleep for 0.1 second
	    }catch(InterruptedException e){
	    }
	    
	    }
    }
}
	    
