public class DekkiBurashi extends Buki{
    DekkiBurashi(Hero h){
        this.name = "デッキブラシ";
    }

    DekkiBurashi(){
        this.name = "デッキブラシ";
    }

    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage= 8+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        }else {
            damage = 20+randam;
            System.out.println(m.name+"デッキブラシの角が当たった！");
            System.out.println(damage+"の大ダメージ！！");
        }
        m.hp -= damage;
    }

	public void description(Hero h) {
		System.out.println(name + "だ！");
        System.out.println("床を磨くことが出来る");
        System.out.println("お掃除の時間だ！！");
	}
}
