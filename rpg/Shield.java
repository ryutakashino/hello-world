public class Shield extends Buki{
    Shield(Hero h){
        this.name = "ポリカーボネートシールド";
    }

    Shield(){
        this.name = "ポリカーボネートシールド";
    }

    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage=2+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        }else {
            damage = 30+randam;
            System.out.println("角がクリティカルヒット！");
            System.out.println(damage+"の大ダメージ！！");
        }
        m.hp -= damage;
    }
	public void description(Hero h){
        h.df += 10;
		System.out.println("ポリカーボネートシールドだ！");
        System.out.println("とにかく固い！！");
        System.out.println("防御力がアップした");
	}
}
