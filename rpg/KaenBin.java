public class KaenBin extends Buki{
    KaenBin(Hero h) {
        this.name = "火炎瓶";
    }
    KaenBin() {
        this.name = "火炎瓶";
    }

    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage=12+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        }else {
            damage = 30+randam;
            System.out.println(m.name+"が燃え上がった！");
            System.out.println(damage+"の大ダメージ！！");
        }
        m.hp -= damage;
    }

	public void description(Hero h) {
		System.out.println(name + "だ！");
        System.out.println("人と人との暖かいふれあいを感じられる！");
        System.out.println("燃え上がれ！！");
	}
}
