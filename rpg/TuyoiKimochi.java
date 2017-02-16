public class TuyoiKimochi extends Buki{

    TuyoiKimochi(Hero h){
        this.name = "強い気持ち";
    }

    TuyoiKimochi(){
        this.name = "強い気持ち";
    }

    public void attack(Man m){
        int damage;
        System.out.println(this.name+"で攻撃！");
        int ran = (int)(Math.random() * 6);
        int randam = (int)(Math.random() * 4);
        if (ran<4){
            damage=1+ran;
            System.out.println(m.name+"に"+damage+"のダメージを与えた！");
        } else {
            damage = 20+randam;
            System.out.println("気持ちの面で打ち勝った！");
            System.out.println(damage+"の大ダメージ！！");
        }
        m.hp -= damage;
    }

	public void description(Hero h){
        h.df += 15;
		System.out.println("強い気持ちだ！");
        System.out.println("気持ちが大事！！");
        System.out.println("防御力がアップした（ような気持ちになった）");
	}
}
