public class Halberd extends Buki{
    Halberd(Hero h){
        this.name = "ハルバード";
    }

    Halberd(){
        this.name = "ハルバード";
    }
    
    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage=35+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        }else {
            damage = 25+randam;
            System.out.println(damage+"のダメージ！！");
        }
        m.hp -= damage;
    }

	public void description(Hero h) {
		System.out.println("ハルバード！");
        System.out.println("すごく強い！");
        System.out.println("常に安定した高火力が売りだ！");
	}
}